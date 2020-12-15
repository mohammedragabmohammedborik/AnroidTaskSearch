package com.mohammed.hypermarketandroidtask.search
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import androidx.recyclerview.widget.DividerItemDecoration
import com.mohammed.com.instadeal.search.adapters.SearchAdapter
import com.mohammed.hypermarketandroidtask.R
import com.mohammed.hypermarketandroidtask.databinding.SearchFragmentBinding
import com.mohammed.hypermarketandroidtask.homef.MainActivity
import com.mohammed.hypermarketandroidtask.presentation.SearchViewModelModel
import com.mohammed.hypermarketandroidtask.presentation.ViewModelFactory

import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.distinctUntilChangedBy
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest

import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

private const val TAG = "CartFragment"
class SearchFragment : Fragment() {
    private lateinit var binding: SearchFragmentBinding
    @Inject
    lateinit var  viewModelFactory: ViewModelFactory

    private lateinit var  searchAdapter: SearchAdapter

    lateinit var  searchViewModelModel: SearchViewModelModel

    private var searchJob: Job? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity as MainActivity).mainComponent.inject(this)
       searchViewModelModel=ViewModelProvider(this, viewModelFactory).get(
           SearchViewModelModel::class.java
        )

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(
            inflater,
            R.layout.search_fragment,
            container,
            false
        )
        // mainCartAdapter
        searchAdapter= SearchAdapter()

        val decoration = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        binding.list.addItemDecoration(decoration)
        binding.list.adapter=searchAdapter

        binding.cancel.setOnClickListener(View.OnClickListener {
            requireActivity().onBackPressed()

        })

        initSearch(binding.searchRepo.text.trim().toString())

        return binding.root
    }
//
    fun search(query: String){
    searchJob?.cancel()
    searchJob = lifecycleScope.launch {
        searchViewModelModel.search(query).collectLatest {
            searchAdapter.submitData(it)
        }
    }
    }

    //
    private fun initSearch(query: String) {
        binding.searchRepo.setText(query)
        binding.searchRepo.addTextChangedListener() {
            updateRepoListFromInput()
        }
          //  binding.searchRepo.addTextChangedListener(textWatcher:TextWatcher{})

        binding.searchRepo.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_GO) {
                updateRepoListFromInput()
                true
            } else {
                false
            }
        }
        binding.searchRepo.setOnKeyListener { _, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                updateRepoListFromInput()
                true
            } else {
                false
            }
        }

        // Scroll to top when the list is refreshed from network.
        lifecycleScope.launch {
            searchAdapter.loadStateFlow
                // Only emit when REFRESH LoadState for RemoteMediator changes.
                .distinctUntilChangedBy { it.refresh }
                // Only react to cases where Remote REFRESH completes i.e., NotLoading.
                .filter { it.refresh is LoadState.NotLoading }
                .collect { binding.list.scrollToPosition(0) }
        }
    }

    private fun updateRepoListFromInput() {
        binding.searchRepo.text.trim().let {
            if (it.isNotEmpty()) {
                search(it.toString())
                Log.w(TAG, "updateRepoListFromInput: "+it.toString() )
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()

    }
}