package com.mohammed.hypermarketandroidtask
import com.mohammed.hypermarketandroidtask.datalayer.ProductResponse
import retrofit2.http.*


interface RetrofitServices {

    @GET("api/search")
    @Headers("Content-Type: application/x-www-form-urlencoded ","Accept: application/json")
    suspend fun getSearch(@Query("search")search:String,@Query("page")page:Int
                            , @Header("lang")lang:String):ProductResponse

}