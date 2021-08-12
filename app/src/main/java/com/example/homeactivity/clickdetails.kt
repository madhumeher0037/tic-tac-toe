package com.example.homeactivity

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity

class clickdetails:AppCompatActivity() {
    public fun invoke() {
        val webIntent: Intent = Uri.parse("https://meet.google.com/").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }
        applicationContext.startActivity(webIntent)
    }
}
