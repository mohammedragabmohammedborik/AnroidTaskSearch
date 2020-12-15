package com.mohammed.hypermarketandroidtask.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/presentation/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/mohammed/hypermarketandroidtask/repository/Repository;", "(Lcom/mohammed/hypermarketandroidtask/repository/Repository;)V", "_errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "_loading", "", "_responseErrorMessage", "", "errorMessage", "Landroidx/lifecycle/LiveData;", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "loading", "getLoading", "getRepository", "()Lcom/mohammed/hypermarketandroidtask/repository/Repository;", "responseErrorMessage", "getResponseErrorMessage", "search", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/mohammed/hypermarketandroidtask/datalayer/Product;", "queryString", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _responseErrorMessage = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mohammed.hypermarketandroidtask.repository.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResponseErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.mohammed.hypermarketandroidtask.datalayer.Product>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String queryString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mohammed.hypermarketandroidtask.repository.Repository getRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.repository.Repository repository) {
        super();
    }
}