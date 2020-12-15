package com.mohammed.hypermarketandroidtask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/MainComponent;", "", "inject", "", "home", "Lcom/mohammed/hypermarketandroidtask/homef/HomeFragment;", "mainActivity", "Lcom/mohammed/hypermarketandroidtask/homef/MainActivity;", "searchFragment", "Lcom/mohammed/hypermarketandroidtask/search/SearchFragment;", "Factory", "app_debug"})
@dagger.Subcomponent()
public abstract interface MainComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.homef.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.homef.HomeFragment home);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.search.SearchFragment searchFragment);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/MainComponent$Factory;", "", "create", "Lcom/mohammed/hypermarketandroidtask/MainComponent;", "app_debug"})
    @dagger.Subcomponent.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.mohammed.hypermarketandroidtask.MainComponent create();
    }
}