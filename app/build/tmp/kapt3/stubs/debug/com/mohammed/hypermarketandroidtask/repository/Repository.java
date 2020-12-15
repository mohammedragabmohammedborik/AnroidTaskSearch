package com.mohammed.hypermarketandroidtask.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/repository/Repository;", "", "getSearch", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/mohammed/hypermarketandroidtask/datalayer/Product;", "querySearch", "", "app_debug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.mohammed.hypermarketandroidtask.datalayer.Product>> getSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String querySearch);
}