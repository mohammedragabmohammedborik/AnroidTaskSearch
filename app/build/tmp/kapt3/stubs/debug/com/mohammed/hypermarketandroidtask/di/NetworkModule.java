package com.mohammed.hypermarketandroidtask.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/di/NetworkModule;", "", "()V", "provideLoginRetrofitService", "Lcom/mohammed/hypermarketandroidtask/RetrofitServices;", "Binders", "app_debug"})
@dagger.Module(includes = {com.mohammed.hypermarketandroidtask.di.NetworkModule.Binders.class})
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.mohammed.hypermarketandroidtask.RetrofitServices provideLoginRetrofitService() {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/di/NetworkModule$Binders;", "", "bindRemateDataSource", "Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSource;", "providerRemoteDataSourceImpl", "Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSourceImpl;", "app_debug"})
    @dagger.Module()
    public static abstract interface Binders {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource bindRemateDataSource(@org.jetbrains.annotations.NotNull()
        com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSourceImpl providerRemoteDataSourceImpl);
    }
}