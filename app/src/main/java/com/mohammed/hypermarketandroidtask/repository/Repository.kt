package com.mohammed.hypermarketandroidtask.repository
import androidx.paging.PagingData
import com.mohammed.hypermarketandroidtask.datalayer.Product
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getSearch(querySearch:String): Flow<PagingData<Product>>






}