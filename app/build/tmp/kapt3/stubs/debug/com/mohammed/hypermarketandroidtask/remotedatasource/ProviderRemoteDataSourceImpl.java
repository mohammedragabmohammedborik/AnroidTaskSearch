package com.mohammed.hypermarketandroidtask.remotedatasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSourceImpl;", "Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSource;", "retrofitServices", "Lcom/mohammed/hypermarketandroidtask/RetrofitServices;", "(Lcom/mohammed/hypermarketandroidtask/RetrofitServices;)V", "getRetrofitServices", "()Lcom/mohammed/hypermarketandroidtask/RetrofitServices;", "getSearch", "Lcom/mohammed/hypermarketandroidtask/datalayer/ProductResponse;", "querySearch", "", "page", "", "lang", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProviderRemoteDataSourceImpl implements com.mohammed.hypermarketandroidtask.remotedatasource.ProviderRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.mohammed.hypermarketandroidtask.RetrofitServices retrofitServices = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String querySearch, int page, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohammed.hypermarketandroidtask.datalayer.ProductResponse> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mohammed.hypermarketandroidtask.RetrofitServices getRetrofitServices() {
        return null;
    }
    
    @javax.inject.Inject()
    public ProviderRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.RetrofitServices retrofitServices) {
        super();
    }
}