package com.example.kotlinsplash

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ThirdActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView
    private  lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList:Array<Int>
    lateinit var titleList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        imageList = arrayOf(
            R.drawable.list,
            R.drawable.list,
            R.drawable.list,
            R.drawable.list,
            R.drawable.list,
            R.drawable.list,
            R.drawable.list,
            R.drawable.list,
        )

        titleList = arrayOf(
            "ListView",
            "Checkbox",
            "ListView",
            "Checkbox",
            "ListView",
            "Checkbox",
            "ListView",
            "Checkbox",
        )

       recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        dataList = arrayListOf()
        getData()


    }
    private fun getData(){
        for(i in imageList.indices){
            val dataClass = DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}