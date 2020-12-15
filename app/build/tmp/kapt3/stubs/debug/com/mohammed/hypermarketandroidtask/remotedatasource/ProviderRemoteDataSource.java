package com.mohammed.hypermarketandroidtask.remotedatasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/remotedatasource/ProviderRemoteDataSource;", "", "getSearch", "Lcom/mohammed/hypermarketandroidtask/datalayer/ProductResponse;", "querySearch", "", "page", "", "lang", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProviderRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String querySearch, int page, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohammed.hypermarketandroidtask.datalayer.ProductResponse> p3);
}