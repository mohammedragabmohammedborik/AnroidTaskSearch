package com.mohammed.hypermarketandroidtask.repository
import androidx.paging.PagingSource
import com.mohammed.hypermarketandroidtask.datalayer.Product
import com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource
import retrofit2.HttpException
import java.io.IOException
import java.lang.Exception

private const val GITHUB_STARTING_PAGE_INDEX = 1

class GithubPagingSourceSearch(val remoteDataSource: ProviderRemoteDataSource, val searchQuery:String, val lang:String): PagingSource<Int, Product>()  {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Product> {
        val position = params.key ?: GITHUB_STARTING_PAGE_INDEX

        return try {
            val response = remoteDataSource.getSearch(searchQuery, position,lang)
            val repos = response.data.data
            LoadResult.Page(
                data = repos,
                prevKey = if (position == GITHUB_STARTING_PAGE_INDEX) null else position - 1,
                nextKey = if (repos.isEmpty()) null else position + 1
            )
        }
        catch (exception: Exception) {
            LoadResult.Error(exception)
        }
        catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }

}