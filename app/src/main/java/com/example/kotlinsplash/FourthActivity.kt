package com.example.kotlinsplash

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FourthActivity : AppCompatActivity() {

    private  lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)
        val showButton: Button = findViewById(R.id.showButton)

        showButton.setOnClickListener {
            showAlertDialog()
        }

    }
    private fun showAlertDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Hello world")
            .setMessage("How are you?")
            .setPositiveButton("yes"){ dialog, which -> Toast.makeText(this, "The app is successfully uninstalled",
                Toast.LENGTH_SHORT) }
            .setNegativeButton("No"){dialog, which -> dialog.dismiss() }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
    }
}