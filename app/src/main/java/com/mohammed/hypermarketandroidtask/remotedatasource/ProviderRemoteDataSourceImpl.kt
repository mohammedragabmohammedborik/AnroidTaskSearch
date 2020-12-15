package com.mohammed.hypermarketandroidtask.remotedatasource
import com.mohammed.hypermarketandroidtask.RetrofitServices
import com.mohammed.hypermarketandroidtask.datalayer.ProductResponse
import javax.inject.Inject

class ProviderRemoteDataSourceImpl @Inject constructor( val retrofitServices: RetrofitServices): ProviderRemoteDataSource {

    override suspend fun getSearch(
        querySearch: String,
        page: Int,
        lang: String
    ): ProductResponse {
        return retrofitServices.getSearch(querySearch,page,lang)
    }
}