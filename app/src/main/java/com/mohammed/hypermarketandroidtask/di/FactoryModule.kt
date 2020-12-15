package com.mohammed.hypermarketandroidtask.di
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mohammed.hypermarketandroidtask.presentation.HomeViewModel
import com.mohammed.hypermarketandroidtask.presentation.SearchViewModelModel
import com.mohammed.hypermarketandroidtask.presentation.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FactoryModule {
    @Binds
    abstract fun bindsViewModelFactory(
        factory: ViewModelFactory
    ): ViewModelProvider.Factory
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun HomeViewModel(homeVM: HomeViewModel): ViewModel

@Binds
@IntoMap
@ViewModelKey(SearchViewModelModel::class)
abstract fun searchViewModelModelFactory(searchViewModelModel_Factory: SearchViewModelModel): ViewModel



}