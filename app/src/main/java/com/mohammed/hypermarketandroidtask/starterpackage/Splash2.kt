package com.mohammed.hypermarketandroidtask.starterpackage
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
private const val TAG = "Splash2"
class Splash2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this,OnBoardingActivity::class.java))


    }

}