package com.mohammed.hypermarketandroidtask.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ+\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/repository/GithubPagingSourceSearch;", "Landroidx/paging/PagingSource;", "", "Lcom/mohammed/hypermarketandroidtask/datalayer/Product;", "remoteDataSource", "Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSource;", "searchQuery", "", "lang", "(Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSource;Ljava/lang/String;Ljava/lang/String;)V", "getLang", "()Ljava/lang/String;", "getRemoteDataSource", "()Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSource;", "getSearchQuery", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GithubPagingSourceSearch extends androidx.paging.PagingSource<java.lang.Integer, com.mohammed.hypermarketandroidtask.datalayer.Product> {
    @org.jetbrains.annotations.NotNull()
    private final com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource remoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lang = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.mohammed.hypermarketandroidtask.datalayer.Product>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource getRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang() {
        return null;
    }
    
    public GithubPagingSourceSearch(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        super();
    }
}