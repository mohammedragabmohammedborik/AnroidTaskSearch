package com.mohammed.hypermarketandroidtask.starterpackage.customView

import androidx.annotation.DrawableRes
import com.mohammed.hypermarketandroidtask.R

class OnBoardingPage(@DrawableRes val image:Int) {

      companion object{
          fun getList(lang:String):List<OnBoardingPage>{
              val imageListE= listOf(OnBoardingPage(R.drawable.hyper),OnBoardingPage(R.drawable.hyper2))
              val imageListA= listOf(OnBoardingPage(R.drawable.hyper),OnBoardingPage(R.drawable.hyper2))

              if (lang=="en"){
                  return imageListE
              }else{
                  return  imageListA
              }


          }
      }

}