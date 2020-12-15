package com.mohammed.hypermarketandroidtask.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\'\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/mohammed/hypermarketandroidtask/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/mohammed/hypermarketandroidtask/databinding/SearchFragmentBinding;", "searchAdapter", "Lcom/mohammed/com/instadeal/search/adapters/SearchAdapter;", "searchJob", "Lkotlinx/coroutines/Job;", "searchViewModelModel", "Lcom/mohammed/hypermarketandroidtask/presentation/SearchViewModelModel;", "getSearchViewModelModel", "()Lcom/mohammed/hypermarketandroidtask/presentation/SearchViewModelModel;", "setSearchViewModelModel", "(Lcom/mohammed/hypermarketandroidtask/presentation/SearchViewModelModel;)V", "viewModelFactory", "Lcom/mohammed/hypermarketandroidtask/presentation/ViewModelFactory;", "getViewModelFactory", "()Lcom/mohammed/hypermarketandroidtask/presentation/ViewModelFactory;", "setViewModelFactory", "(Lcom/mohammed/hypermarketandroidtask/presentation/ViewModelFactory;)V", "initSearch", "", "query", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "search", "updateRepoListFromInput", "app_debug"})
public final class SearchFragment extends androidx.fragment.app.Fragment {
    private com.mohammed.hypermarketandroidtask.databinding.SearchFragmentBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mohammed.hypermarketandroidtask.presentation.ViewModelFactory viewModelFactory;
    private com.mohammed.com.instadeal.search.adapters.SearchAdapter searchAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.mohammed.hypermarketandroidtask.presentation.SearchViewModelModel searchViewModelModel;
    private kotlinx.coroutines.Job searchJob;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mohammed.hypermarketandroidtask.presentation.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.presentation.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mohammed.hypermarketandroidtask.presentation.SearchViewModelModel getSearchViewModelModel() {
        return null;
    }
    
    public final void setSearchViewModelModel(@org.jetbrains.annotations.NotNull()
    com.mohammed.hypermarketandroidtask.presentation.SearchViewModelModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void initSearch(java.lang.String query) {
    }
    
    private final void updateRepoListFromInput() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public SearchFragment() {
        super();
    }
}