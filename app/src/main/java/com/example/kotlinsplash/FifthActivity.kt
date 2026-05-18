package com.example.kotlinsplash

import androidx.fragment.app.Fragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.kotlinsplash.databinding.ActivityFifthBinding

class FifthActivity : AppCompatActivity() {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFragment1.setOnClickListener {
            gotToFragment(Fragment1())
        }
        binding.buttonFragment2.setOnClickListener {
            gotToFragment(Fragment2())
        }

    }
    private fun gotToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}

