package com.mohammed.hypermarketandroidtask.homef
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.mohammed.hypermarketandroidtask.MainComponent
import com.mohammed.hypermarketandroidtask.MyApplication
import com.mohammed.hypermarketandroidtask.R
import com.mohammed.hypermarketandroidtask.SharedPreferencesStorage
import com.mohammed.hypermarketandroidtask.databinding.HomeActivityBinding
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    lateinit var  homeActivityBinding: HomeActivityBinding
    lateinit var  mainComponent: MainComponent
    lateinit var  progressFr: DialogFragment
    private lateinit var appBarConfiguration: AppBarConfiguration
    @Inject
      lateinit var  sharedPreferencesStorage: SharedPreferencesStorage
    override fun onCreate(savedInstanceState: Bundle?) {
        mainComponent=(application as MyApplication).appllicationComponent.mainComponent().create()
        mainComponent.inject(this)
        super.onCreate(savedInstanceState)
        homeActivityBinding=HomeActivityBinding.inflate(layoutInflater)
        setContentView(homeActivityBinding.root)
        setSupportActionBar(homeActivityBinding.toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        val navController = findNavController(R.id.nav_home)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
        homeActivityBinding.line1.setOnClickListener(View.OnClickListener {
            navController.navigate(R.id.searchFragment)
        })

        // listener for change listener
        navController.addOnDestinationChangedListener(NavController.OnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
                R.id.homeFragment -> {
                    homeActivityBinding.toolbar.visibility = View.VISIBLE

                }

                R.id.searchFragment ->{
                    homeActivityBinding.toolbar.visibility = View.GONE

                }


            }

        })


    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_home)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
    //

}