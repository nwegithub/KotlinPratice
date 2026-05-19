package com.example.kotlinsplash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Explicit Intent
//        val explicitButton = findViewById<Button>(R.id.explicitButton)
//
//        explicitButton.setOnClickListener {
//
//            val explicitIntent = Intent(this, ViewPagerActivity::class.java)
//            startActivity(explicitIntent)
//
//            finish()
//        }

        // Implicit Intent
//        val url = "https://www.google.com"
//
//        val implicitButton = findViewById<Button>(R.id.implicitButton)
//
//        implicitButton.setOnClickListener {
//
//            val implicitIntent = Intent(
//                Intent.ACTION_VIEW,
//                Uri.parse(url)
//            )
//
//            startActivity(implicitIntent)
//        }

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->

            when (menuItem.itemId) {

                R.id.bottom_home -> {
                    replaceFragment(HomeFragment())
                    true
                }

                R.id.bottom_add -> {
                    Toast.makeText(
                        this,
                        "Upload image & video",
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }

                R.id.bottom_search -> {
                    replaceFragment(SearchFragment())
                    true
                }

                R.id.bottom_profile -> {
                    replaceFragment(ProfileFragment())
                    true
                }

                else -> false
            }
        }

        // Default Fragment
        replaceFragment(HomeFragment())
    }

    private fun replaceFragment(fragment: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_container, fragment)
            .commit()
    }
}