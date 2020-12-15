package com.mohammed.hypermarketandroidtask

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.mohammed.hypermarketandroidtask.datalayer.Product

/**
 * here we  make annoation for binding image
 */


/**
 * Uses the Glide library to load an image by URL into an [ImageView]
 */
// here we add main for content section name
@BindingAdapter("mainContentName")
fun TextView.setPateintnameWaitningList(item: Product) {
    text = item.name
}

@BindingAdapter("contentImage")
fun setContentSection(modelImage: ImageView?, imageUrl: String) {
    Glide.with(modelImage!!)
        .load(imageUrl)
        .into(modelImage)
}
