package com.mohammed.hypermarketandroidtask.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00160\u00152\u0006\u0010 \u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0016\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/presentation/SearchViewModelModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/mohammed/hypermarketandroidtask/repository/Repository;", "(Lcom/mohammed/hypermarketandroidtask/repository/Repository;)V", "_contentSectionMutableLiveDataS", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/mohammed/hypermarketandroidtask/datalayer/Product;", "_errorMessage", "", "_loading", "", "_responseErrorMessage", "", "contentSectionMutableLiveDataS", "Landroidx/lifecycle/LiveData;", "getContentSectionMutableLiveDataS", "()Landroidx/lifecycle/LiveData;", "currentQueryValue", "currentSearchResult", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "errorMessage", "getErrorMessage", "loading", "getLoading", "getRepository", "()Lcom/mohammed/hypermarketandroidtask/repository/Repository;", "responseErrorMessage", "getResponseErrorMessage", "search", "queryString", "app_debug"})
public final class SearchViewModelModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _responseErrorMessage = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _errorMessage = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.mohammed.hypermarketandroidtask.datalayer.Product>> _contentSectionMutableLiveDataS = null;
    private java.lang.String currentQueryValue;
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.mohammed.hypermarketandroidtask.datalayer.Product>> currentSearchResult;
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
    public final androidx.lifecycle.LiveData<java.util.List<com.mohammed.hypermarketandroidtask.datalayer.Product>> getContentSectionMutableLiveDataS() {
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
    public SearchViewModelModel(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.repository.Repository repository) {
        super();
    }
}