package com.mohammed.hypermarketandroidtask

import com.mohammed.hypermarketandroidtask.homef.HomeFragment
import com.mohammed.hypermarketandroidtask.homef.MainActivity
import com.mohammed.hypermarketandroidtask.search.SearchFragment
import dagger.Subcomponent

@Subcomponent
interface  MainComponent{

    @Subcomponent.Factory
    interface Factory{
        fun create():MainComponent
    }
    fun  inject(mainActivity: MainActivity)
//    fun  inject(loginFragment: LoginFragment)
    fun inject(home: HomeFragment)

    fun  inject(searchFragment: SearchFragment)
    //










}