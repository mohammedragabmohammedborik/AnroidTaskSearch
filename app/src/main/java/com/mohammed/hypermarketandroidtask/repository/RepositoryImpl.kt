package com.mohammed.hypermarketandroidtask.repository
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.mohammed.hypermarketandroidtask.SharedPreferencesStorage
import com.mohammed.hypermarketandroidtask.datalayer.Product
import com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(val remoteDataSource: ProviderRemoteDataSource,val sharedPreferencesStorage: SharedPreferencesStorage) : Repository {


    override fun getSearch(querySearch: String): Flow<PagingData<Product>> {
        return  Pager(config =PagingConfig(pageSize = NETWORK_PAGE_SIZE, enablePlaceholders = false)
            ,pagingSourceFactory = { GithubPagingSourceSearch(remoteDataSource,querySearch,sharedPreferencesStorage.getLanguage()!!
                ) }
        ).flow
    }


    // handle all categories
//    override suspend fun getAllMainCategory(): MainCategoryTextRespons {
//        return remoteDataSource.getAllMainCategory(sharedPreferencesStorage.getLanguage()!!,"Bearer "+sharedPreferencesStorage.getUserData().token)
//    }

    companion object {
        private const val NETWORK_PAGE_SIZE = 10
    }
}