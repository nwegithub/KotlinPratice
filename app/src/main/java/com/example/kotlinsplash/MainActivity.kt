package com.example.kotlinsplash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Explicit Intent
        val explicitButton = findViewById<Button>(R.id.explicitButton)

        explicitButton.setOnClickListener {

            val explicitIntent = Intent(this, FourthActivity::class.java)

            startActivity(explicitIntent)

            finish()
        }
        //Implicit Intent
        val url = "https://www.google.com"
        val implicitButton = findViewById<Button>(R.id.implicitButton)
        implicitButton.setOnClickListener {
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(implicitIntent)
        }
    }
}