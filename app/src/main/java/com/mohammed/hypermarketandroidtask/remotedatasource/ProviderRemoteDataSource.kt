package com.mohammed.hypermarketandroidtask.remotedatasource

import com.mohammed.hypermarketandroidtask.datalayer.ProductResponse

interface ProviderRemoteDataSource {
//
suspend fun getSearch(querySearch:String,page:Int
                        , lang:String
                        ):ProductResponse
}