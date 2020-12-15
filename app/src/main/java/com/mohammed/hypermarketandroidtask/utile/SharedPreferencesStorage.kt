package com.mohammed.hypermarketandroidtask
import android.content.Context



import android.content.SharedPreferences
import javax.inject.Inject

import javax.inject.Singleton

@Singleton
class SharedPreferencesStorage @Inject constructor( val context: Context) {

    val sharedPreferences: SharedPreferences
        get()=(context as Context).getSharedPreferences("com.mohammed.hypermarketandroidtask", Context.MODE_PRIVATE)


    // init {
    // val sharedPreferences =

    //  }

    companion object{

        private  const val KEY_LANGUAGE="user_language"


    }

    //
    fun setLanguage(lang:String){
        with(sharedPreferences.edit()) {
            putString(KEY_LANGUAGE,lang)
        apply()
        }
    }
    fun  getLanguage(): String? {
        return sharedPreferences.getString(KEY_LANGUAGE,"ar")

    }




}