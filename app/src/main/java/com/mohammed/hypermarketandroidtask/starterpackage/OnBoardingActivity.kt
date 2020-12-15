package com.mohammed.hypermarketandroidtask.starterpackage
import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mohammed.hypermarketandroidtask.R
import com.mohammed.hypermarketandroidtask.SharedPreferencesStorage
import java.util.*

class OnBoardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.window.apply {

            statusBarColor = Color.TRANSPARENT
        }
        setContentView(R.layout.activity_on_boarding)
        val currentLang: String = Locale.getDefault().getLanguage()
        val DeviceLang = Resources.getSystem().configuration.locale.language
        Log.w("TAG", "onCreate: DD "+DeviceLang )

      //  Resources.getSystem().getConfiguration().locales[0]

        Log.w("TAG", "onCreate: " + currentLang)
        SharedPreferencesStorage(this).setLanguage(currentLang)


    }
}