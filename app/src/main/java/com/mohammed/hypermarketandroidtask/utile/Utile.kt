package com.mohammed.com.instadeal.utile

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import java.security.MessageDigest

class Utile {

    companion object {


        val CONSTANTKEY:String="dd322ca0a2102254ac7ccc5a2e7c04f4"
        fun String.to265(): String {
            // toByteArray: default is Charsets.UTF_8 - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/to-byte-array.html
            val bytes = MessageDigest.getInstance("SHA-256").digest(this.toByteArray())
            return bytes.toHex()
        }

        fun ByteArray.toHex(): String {
            return joinToString("") { "%02x".format(it) }



        }

        fun isOnline(context: Context): Boolean {
            val connectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            if (connectivityManager != null) {
                val capabilities =
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
                    } else {
                        TODO("VERSION.SDK_INT < M")
                    }
                if (capabilities != null) {
                    if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                        Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR")
                        return true
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                        Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI")
                        return true
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
                        Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                        return true
                    }
                }else{
                    Log.i("Internet", "ERRRO")

                }
            }
            return false
        }
    }
}