package com.mohammed.hypermarketandroidtask.di
import com.mohammed.hypermarketandroidtask.repository.Repository
import com.mohammed.hypermarketandroidtask.repository.RepositoryImpl
import dagger.Binds
import dagger.Module

@Module(includes = [RepositoryModule.BinderRepositiory::class])
class RepositoryModule {
     @Module
     interface  BinderRepositiory
     {
          @Binds
          fun repositoryBind(authRepositoryImpl: RepositoryImpl): Repository
//          @Binds
//          fun homeRepositoryBind(homeRepositoryImpl: RepositoryImpl):Repository

     }

}