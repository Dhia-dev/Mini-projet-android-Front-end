package com.example.geochat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var splash = findViewById<ImageView>(R.id.imageView2)
        splash.animate().setDuration(3000).alpha(0f).withEndAction{

            // splash.alpha = 1f

            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@MainActivity, Login:: class.java  )
                startActivity(intent)
            },3000)
    }
}}