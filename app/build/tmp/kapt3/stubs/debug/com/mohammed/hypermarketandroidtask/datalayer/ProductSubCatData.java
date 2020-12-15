package com.mohammed.hypermarketandroidtask.datalayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\bH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u0087\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\t\u00103\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014\u00a8\u00064"}, d2 = {"Lcom/mohammed/hypermarketandroidtask/datalayer/ProductSubCatData;", "", "current_page", "", "data", "", "Lcom/mohammed/hypermarketandroidtask/datalayer/Product;", "first_page_url", "", "from", "last_page", "last_page_url", "next_page_url", "path", "per_page", "prev_page_url", "to", "total", "(ILjava/util/List;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "getCurrent_page", "()I", "getData", "()Ljava/util/List;", "getFirst_page_url", "()Ljava/lang/String;", "getFrom", "getLast_page", "getLast_page_url", "getNext_page_url", "getPath", "getPer_page", "getPrev_page_url", "getTo", "getTotal", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ProductSubCatData {
    private final int current_page = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.mohammed.hypermarketandroidtask.datalayer.Product> data = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String first_page_url = null;
    private final int from = 0;
    private final int last_page = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String last_page_url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String next_page_url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = null;
    private final int per_page = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String prev_page_url = null;
    private final int to = 0;
    private final int total = 0;
    
    public final int getCurrent_page() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mohammed.hypermarketandroidtask.datalayer.Product> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirst_page_url() {
        return null;
    }
    
    public final int getFrom() {
        return 0;
    }
    
    public final int getLast_page() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLast_page_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNext_page_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    public final int getPer_page() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrev_page_url() {
        return null;
    }
    
    public final int getTo() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public ProductSubCatData(int current_page, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mohammed.hypermarketandroidtask.datalayer.Product> data, @org.jetbrains.annotations.NotNull()
    java.lang.String first_page_url, int from, int last_page, @org.jetbrains.annotations.NotNull()
    java.lang.String last_page_url, @org.jetbrains.annotations.NotNull()
    java.lang.String next_page_url, @org.jetbrains.annotations.NotNull()
    java.lang.String path, int per_page, @org.jetbrains.annotations.NotNull()
    java.lang.String prev_page_url, int to, int total) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mohammed.hypermarketandroidtask.datalayer.Product> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mohammed.hypermarketandroidtask.datalayer.ProductSubCatData copy(int current_page, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mohammed.hypermarketandroidtask.datalayer.Product> data, @org.jetbrains.annotations.NotNull()
    java.lang.String first_page_url, int from, int last_page, @org.jetbrains.annotations.NotNull()
    java.lang.String last_page_url, @org.jetbrains.annotations.NotNull()
    java.lang.String next_page_url, @org.jetbrains.annotations.NotNull()
    java.lang.String path, int per_page, @org.jetbrains.annotations.NotNull()
    java.lang.String prev_page_url, int to, int total) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}