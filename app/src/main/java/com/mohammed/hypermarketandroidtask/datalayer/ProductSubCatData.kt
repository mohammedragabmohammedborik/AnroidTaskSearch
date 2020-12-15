package com.mohammed.hypermarketandroidtask.datalayer


data class ProductSubCatData(
    val current_page: Int,
    val `data`: List<Product>,
    val first_page_url: String,
    val from: Int,
    val last_page: Int,
    val last_page_url: String,
    val next_page_url: String,
    val path: String,
    val per_page: Int,
    val prev_page_url: String,
    val to: Int,
    val total: Int
)