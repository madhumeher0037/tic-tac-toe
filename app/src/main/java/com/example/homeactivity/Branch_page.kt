package com.example.homeactivity

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView
import android.widget.Toast

class Branch_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_branch_page)
        val cse_branch=findViewById<TextView>(R.id.CSE)
        val it_branch=findViewById<TextView>(R.id.IT)
        val next_button=findViewById<Button>(R.id.next2)
        var count:Int = 0
        cse_branch.setOnClickListener {
            count=1
            default_colors()
            cse_branch.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        }
        it_branch.setOnClickListener {
            count=2
            default_colors()
            it_branch.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        }
        next_button.setOnClickListener{
            when(count)
            {
                0 ->{
                    Toast.makeText(this,"select any option",Toast.LENGTH_SHORT).show()
                }
                1 ->{
                    val intent = Intent(this,cse_page::class.java).apply {  }
                    startActivity(intent)
                }
                2 ->{
                    val intent = Intent(this,it_page::class.java).apply {  }
                    startActivity(intent)
                }
            }
        }
    }
    fun default_colors()
    {
        val cse_branch=findViewById<TextView>(R.id.CSE)
        val it_branch=findViewById<TextView>(R.id.IT)
        cse_branch.setBackgroundColor(Color.parseColor("#FFBC19"))
        it_branch.setBackgroundColor(Color.parseColor("#FFBC19"))
    }
}