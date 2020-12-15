package com.mohammed.hypermarketandroidtask.starterpackage.customView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mohammed.hypermarketandroidtask.R
import kotlinx.android.synthetic.main.onboarding_page_item.view.*

class OnBoardingPagerAdapter( lang:String,private val onBoardingPageList:List<OnBoardingPage> = OnBoardingPage.getList(lang))
    : RecyclerView.Adapter<PagerViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): PagerViewHolder {
        return LayoutInflater.from(parent.context).inflate(
            PagerViewHolder.LAYOUT, parent, false
        ).let { PagerViewHolder(it) }
    }

    override fun getItemCount() = onBoardingPageList.size

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.bind(onBoardingPageList[position])
    }
}

class PagerViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {
    fun bind(onBoardingPage: OnBoardingPage) {
        val res = root.context.resources
        Glide.with(root)
            .load(onBoardingPage.image)
            .into(root.imageView)
    }

    companion object {
        @LayoutRes
        val LAYOUT = R.layout.onboarding_page_item
    }
}