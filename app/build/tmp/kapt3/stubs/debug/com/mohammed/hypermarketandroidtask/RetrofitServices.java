package com.mohammed.hypermarketandroidtask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/RetrofitServices;", "", "getSearch", "Lcom/mohammed/hypermarketandroidtask/datalayer/ProductResponse;", "search", "", "page", "", "lang", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RetrofitServices {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Headers(value = {"Content-Type: application/x-www-form-urlencoded ", "Accept: application/json"})
    @retrofit2.http.GET(value = "api/search")
    public abstract java.lang.Object getSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "search")
    java.lang.String search, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "lang")
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohammed.hypermarketandroidtask.datalayer.ProductResponse> p3);
}