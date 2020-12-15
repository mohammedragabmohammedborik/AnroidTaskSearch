package com.mohammed.hypermarketandroidtask

import android.app.Application
import com.mohammed.hypermarketandroidtask.di.AppllicationComponent
import com.mohammed.hypermarketandroidtask.di.DaggerAppllicationComponent

class MyApplication:Application() {


    val  appllicationComponent: AppllicationComponent by lazy{
        DaggerAppllicationComponent.factory().create(applicationContext)
    }
}