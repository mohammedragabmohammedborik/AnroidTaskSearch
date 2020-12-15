package com.mohammed.hypermarketandroidtask.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/di/FactoryModule;", "", "()V", "HomeViewModel", "Landroidx/lifecycle/ViewModel;", "homeVM", "Lcom/mohammed/hypermarketandroidtask/presentation/HomeViewModel;", "bindsViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/mohammed/hypermarketandroidtask/presentation/ViewModelFactory;", "searchViewModelModelFactory", "searchViewModelModel_Factory", "Lcom/mohammed/hypermarketandroidtask/presentation/SearchViewModelModel;", "app_debug"})
@dagger.Module()
public abstract class FactoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindsViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.presentation.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.mohammed.hypermarketandroidtask.presentation.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.presentation.HomeViewModel homeVM);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.mohammed.hypermarketandroidtask.presentation.SearchViewModelModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel searchViewModelModelFactory(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.presentation.SearchViewModelModel searchViewModelModel_Factory);
    
    public FactoryModule() {
        super();
    }
}