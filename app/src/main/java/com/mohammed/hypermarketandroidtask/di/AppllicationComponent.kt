package com.mohammed.hypermarketandroidtask.di
import android.content.Context
import com.mohammed.hypermarketandroidtask.MainComponent
import com.teraninjas.doctors_android_providers.di.ModuleAppSubcomponents
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

// The "modules" attribute in the @Component annotation tells Dagger what Modules
// to include when building the graph
@Singleton
@Component(modules = [ModuleAppSubcomponents::class, NetworkModule::class, RepositoryModule::class,FactoryModule::class])

interface AppllicationComponent {
    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppllicationComponent
    }
    // Expose AuthComponent factory from the graph
    fun mainComponent():MainComponent.Factory

    //




}