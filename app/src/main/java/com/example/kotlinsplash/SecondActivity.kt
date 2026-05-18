package com.example.kotlinsplash

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val listView: ListView = findViewById(R.id.listView)
        val listItems = arrayOf("Read a Book",
            "Go to Gym",
            "Learn Kotlin",
            "Do Homework",
            "Watch Tutorial")
        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,listItems)
        listView.adapter = listAdapter

        listView.setOnItemClickListener { parent, view, position, id ->

            val selectedItem = parent.getItemAtPosition(position) as String

            Toast.makeText(
                this,
                "You have clicked on: $selectedItem",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}