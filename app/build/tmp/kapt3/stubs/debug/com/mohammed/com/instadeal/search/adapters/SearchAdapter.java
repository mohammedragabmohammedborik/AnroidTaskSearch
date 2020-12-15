package com.mohammed.com.instadeal.search.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/mohammed/com/instadeal/search/adapters/SearchAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/mohammed/hypermarketandroidtask/datalayer/Product;", "Lcom/mohammed/com/instadeal/search/adapters/SearchAdapter$ContentSectionViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ContentSectionViewHolder", "app_debug"})
public final class SearchAdapter extends androidx.paging.PagingDataAdapter<com.mohammed.hypermarketandroidtask.datalayer.Product, com.mohammed.com.instadeal.search.adapters.SearchAdapter.ContentSectionViewHolder> {
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.mohammed.hypermarketandroidtask.datalayer.Product> DIFFUTILE = null;
    public static final com.mohammed.com.instadeal.search.adapters.SearchAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mohammed.com.instadeal.search.adapters.SearchAdapter.ContentSectionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mohammed.com.instadeal.search.adapters.SearchAdapter.ContentSectionViewHolder holder, int position) {
    }
    
    public SearchAdapter() {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/mohammed/com/instadeal/search/adapters/SearchAdapter$ContentSectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemDrugBinding", "Lcom/mohammed/hypermarketandroidtask/databinding/ItemSearchBinding;", "(Lcom/mohammed/hypermarketandroidtask/databinding/ItemSearchBinding;)V", "getItemDrugBinding", "()Lcom/mohammed/hypermarketandroidtask/databinding/ItemSearchBinding;", "bind", "", "drugModel", "Lcom/mohammed/hypermarketandroidtask/datalayer/Product;", "Companion", "app_debug"})
    public static final class ContentSectionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.mohammed.hypermarketandroidtask.databinding.ItemSearchBinding itemDrugBinding = null;
        public static final com.mohammed.com.instadeal.search.adapters.SearchAdapter.ContentSectionViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.mohammed.hypermarketandroidtask.datalayer.Product drugModel) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mohammed.hypermarketandroidtask.databinding.ItemSearchBinding getItemDrugBinding() {
            return null;
        }
        
        private ContentSectionViewHolder(com.mohammed.hypermarketandroidtask.databinding.ItemSearchBinding itemDrugBinding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/mohammed/com/instadeal/search/adapters/SearchAdapter$ContentSectionViewHolder$Companion;", "", "()V", "from", "Lcom/mohammed/com/instadeal/search/adapters/SearchAdapter$ContentSectionViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.mohammed.com.instadeal.search.adapters.SearchAdapter.ContentSectionViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/mohammed/com/instadeal/search/adapters/SearchAdapter$Companion;", "", "()V", "DIFFUTILE", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/mohammed/hypermarketandroidtask/datalayer/Product;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}