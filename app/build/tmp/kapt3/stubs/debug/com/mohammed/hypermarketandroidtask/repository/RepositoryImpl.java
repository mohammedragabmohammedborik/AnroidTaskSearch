package com.mohammed.hypermarketandroidtask.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/repository/RepositoryImpl;", "Lcom/mohammed/hypermarketandroidtask/repository/Repository;", "remoteDataSource", "Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSource;", "sharedPreferencesStorage", "Lcom/mohammed/hypermarketandroidtask/SharedPreferencesStorage;", "(Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSource;Lcom/mohammed/hypermarketandroidtask/SharedPreferencesStorage;)V", "getRemoteDataSource", "()Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSource;", "getSharedPreferencesStorage", "()Lcom/mohammed/hypermarketandroidtask/SharedPreferencesStorage;", "getSearch", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/mohammed/hypermarketandroidtask/datalayer/Product;", "querySearch", "", "Companion", "app_debug"})
public final class RepositoryImpl implements com.mohammed.hypermarketandroidtask.repository.Repository {
    @org.jetbrains.annotations.NotNull()
    private final com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource remoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mohammed.hypermarketandroidtask.SharedPreferencesStorage sharedPreferencesStorage = null;
    private static final int NETWORK_PAGE_SIZE = 10;
    public static final com.mohammed.hypermarketandroidtask.repository.RepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.mohammed.hypermarketandroidtask.datalayer.Product>> getSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String querySearch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource getRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mohammed.hypermarketandroidtask.SharedPreferencesStorage getSharedPreferencesStorage() {
        return null;
    }
    
    @javax.inject.Inject()
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.SharedPreferencesStorage sharedPreferencesStorage) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/repository/RepositoryImpl$Companion;", "", "()V", "NETWORK_PAGE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}