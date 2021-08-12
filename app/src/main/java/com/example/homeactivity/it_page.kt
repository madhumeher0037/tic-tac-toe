package com.example.homeactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class it_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_it_page2)
        val recyclerview: RecyclerView = findViewById(R.id.RV)
        recyclerview.layoutManager= LinearLayoutManager(this)
        val list1:List<String>
        list1= listOf("Java","DBMS","CO","SS","ETC","M3","FA")
        val list2:List<String>
        list2= listOf("10:00-11:00","11:00-12:00","12:00-1:00","2:00-3:00","3:00-4:00","4:00-5:00","5:00-6:00")
        val subs= ArrayList<String>()
        val timings= ArrayList<String>()
        subs.addAll(list1)
        timings.addAll(list2)
        val adapter = class_details(subs,timings)
        recyclerview.adapter = adapter
    }
}