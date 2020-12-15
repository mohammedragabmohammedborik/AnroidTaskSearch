package com.mohammed.hypermarketandroidtask.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/di/RepositoryModule;", "", "()V", "BinderRepositiory", "app_debug"})
@dagger.Module(includes = {com.mohammed.hypermarketandroidtask.di.RepositoryModule.BinderRepositiory.class})
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/di/RepositoryModule$BinderRepositiory;", "", "repositoryBind", "Lcom/mohammed/hypermarketandroidtask/repository/Repository;", "authRepositoryImpl", "Lcom/mohammed/hypermarketandroidtask/repository/RepositoryImpl;", "app_debug"})
    @dagger.Module()
    public static abstract interface BinderRepositiory {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract com.mohammed.hypermarketandroidtask.repository.Repository repositoryBind(@org.jetbrains.annotations.NotNull()
        com.mohammed.hypermarketandroidtask.repository.RepositoryImpl authRepositoryImpl);
    }
}