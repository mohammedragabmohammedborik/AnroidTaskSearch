package com.mohammed.hypermarketandroidtask.homef
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import androidx.recyclerview.widget.DividerItemDecoration
import com.mohammed.com.instadeal.search.adapters.SearchAdapter
import com.mohammed.hypermarketandroidtask.R
import com.mohammed.hypermarketandroidtask.databinding.HomeFragmentBinding
import com.mohammed.hypermarketandroidtask.homef.MainActivity
import com.mohammed.hypermarketandroidtask.presentation.HomeViewModel
import com.mohammed.hypermarketandroidtask.presentation.ViewModelFactory
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChangedBy
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch

import java.util.*
import javax.inject.Inject


private const val TAG = "HomeFragment"
class HomeFragment : Fragment() {
    private lateinit var binding: HomeFragmentBinding
    @Inject
    lateinit var  viewModelFactory: ViewModelFactory
    lateinit var  homeViewModel: HomeViewModel
    private lateinit var  searchAdapter: SearchAdapter
    private var searchJob: Job? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity as MainActivity).mainComponent.inject(this)
        homeViewModel=ViewModelProvider(this, viewModelFactory).get(
            HomeViewModel::class.java
        )

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)
        searchAdapter= SearchAdapter()
        val decoration = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        binding.list.addItemDecoration(decoration)
        binding.list.adapter=searchAdapter
        /**
         * call api  here i am using same api for search  but i fixed the query search
         */

        searchJob?.cancel()
        searchJob = lifecycleScope.launch {
            homeViewModel.search("All").collectLatest {
                searchAdapter.submitData(it)
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


        return binding.root
    }


}