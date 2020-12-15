package com.mohammed.com.instadeal.search.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.mohammed.com.instadeal.search.adapters.SearchAdapter.ContentSectionViewHolder.Companion.from
import com.mohammed.hypermarketandroidtask.databinding.ItemSearchBinding
import com.mohammed.hypermarketandroidtask.datalayer.Product

class SearchAdapter( ) :
    PagingDataAdapter<Product, SearchAdapter.ContentSectionViewHolder>(DIFFUTILE) {


    class ContentSectionViewHolder private  constructor(val itemDrugBinding: ItemSearchBinding) :
        RecyclerView.ViewHolder(itemDrugBinding.root) {

    fun bind(drugModel: Product) {
        itemDrugBinding.product=drugModel
        itemDrugBinding.executePendingBindings()

    }

    companion object {
        fun from(parent: ViewGroup):ContentSectionViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ContentSectionViewHolder(
                ItemSearchBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
            )
        }
    }

}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentSectionViewHolder {
           return  from(parent)
    }

    override fun onBindViewHolder(holder: ContentSectionViewHolder, position: Int) {
      //  position1=position
       var item=getItem(position)
        Log.w("TAG", "onBindViewHolder1: " + item!!.id)
        holder.bind(item!!)
    }
    //
    companion object {
        private val DIFFUTILE = object : DiffUtil.ItemCallback<Product>() {
            override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean =
                oldItem == newItem
        }
    }

}


