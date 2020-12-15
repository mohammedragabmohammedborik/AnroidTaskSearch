package com.mohammed.hypermarketandroidtask.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.mohammed.hypermarketandroidtask.datalayer.Product
import com.mohammed.hypermarketandroidtask.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchViewModelModel @Inject constructor(val repository: Repository): ViewModel() {

    //  check for response loading
    private val _loading = MutableLiveData<Boolean?>()
    val loading: LiveData<Boolean?>
        get() = _loading

    // for check  get message error and print response value
    private val _responseErrorMessage = MutableLiveData<String?>()
    val responseErrorMessage: LiveData<String?>
        get() = _responseErrorMessage

    // for check  get message error
    private val _errorMessage = MutableLiveData<Int>()
    val errorMessage: LiveData<Int>
        get() = _errorMessage



    // content section
    private  val  _contentSectionMutableLiveDataS=MutableLiveData<List<Product>>()
    val  contentSectionMutableLiveDataS:LiveData<List<Product>> get() = _contentSectionMutableLiveDataS
    //

    private var currentQueryValue: String? = null

    private var currentSearchResult: Flow<PagingData<Product>>? = null

    fun search(queryString: String): Flow<PagingData<Product>> {
        val lastResult = currentSearchResult
        if (queryString == currentQueryValue && lastResult != null) {
            return lastResult
        }
        currentQueryValue = queryString
        val newResult: Flow<PagingData<Product>> = repository.getSearch(queryString)
            .cachedIn(viewModelScope)
        currentSearchResult = newResult
        return newResult
    }





}
