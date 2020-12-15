package com.mohammed.hypermarketandroidtask.starterpackage.customView
import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.viewpager2.widget.ViewPager2
import com.mohammed.hypermarketandroidtask.R
import com.mohammed.hypermarketandroidtask.homef.MainActivity
import com.mohammed.hypermarketandroidtask.starterpackage.OnBoardingPrefManager
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.onboarding_view.view.*


import setParallaxTransformation
import java.util.*

class OnBoardingView @JvmOverloads
constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0, defStyleRes: Int = 0) :
    FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val numberOfPages by lazy { OnBoardingPage.getList(getlanguage()).size }
    private val prefManager: OnBoardingPrefManager

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.onboarding_view, this, true)
        setUpSlider(view)
        addingButtonsClickListeners()
        prefManager = OnBoardingPrefManager(view.context)
    }

    private fun setUpSlider(view: View) {
        with(slider) {
            adapter = OnBoardingPagerAdapter(getlanguage())
            setPageTransformer { page, position ->
                setParallaxTransformation(page, position)
            }

            addSlideChangeListener()

            val wormDotsIndicator = view.findViewById<WormDotsIndicator>(R.id.page_indicator)
            wormDotsIndicator.setViewPager2(this)
        }
    }


    private fun addSlideChangeListener() {

        slider.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                if (numberOfPages > 1) {
                    val newProgress = (position + positionOffset) / (numberOfPages - 1)
                    onboardingRoot.progress = newProgress
                }
            }
        })
    }

    private fun addingButtonsClickListeners() {
        nextBtn.setOnClickListener { navigateToNextSlide() }
        skipBtn.setOnClickListener {
            navigateToMainACtivity()
            setFirstTimeLaunchToFalse()
        }
        startBtn.setOnClickListener {
            navigateToMainACtivity()

            setFirstTimeLaunchToFalse()
        }
    }

    private fun setFirstTimeLaunchToFalse() {
        prefManager.isFirstTimeLaunch = false
    }

    private fun navigateToNextSlide() {
        val nextSlidePos: Int = slider?.currentItem?.plus(1) ?: 0
        slider?.setCurrentItem(nextSlidePos, true)
    }

    private fun navigateToMainACtivity() {

        context.startActivity(Intent(this.context,MainActivity::class.java))

    }
    private  fun  getlanguage():String{
    return   Locale.getDefault().getLanguage();
     //   Resources.getConfiguration().locale.getLanguage();

    }
}