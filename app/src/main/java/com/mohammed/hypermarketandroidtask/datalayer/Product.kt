package com.mohammed.hypermarketandroidtask.datalayer

data class Product(
    val discount: String,
    val free_deliver: Boolean,
    val id: Int,
    val image_path: String,
    val is_favourite: Boolean,
    val mainprice: String,
    val name: String,
    val option: Boolean,
    val prefit_price_discount: String
)