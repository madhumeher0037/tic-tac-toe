package com.example.homeactivity


import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val online_class=findViewById<TextView>(R.id.online_class_view)
        val box2=findViewById<TextView>(R.id.Box2)
        val box3=findViewById<TextView>(R.id.Box3)
        val box4=findViewById<TextView>(R.id.Box4)
        var count:Int=0
        online_class.setOnClickListener {
            count =1
            default_colors()
            online_class.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            var intent= Intent(this,Branch_page::class.java).apply {  }
            startActivity(intent)
            finish()
        }
        box2.setOnClickListener {
            count =2
            default_colors()
            box2.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            Toast.makeText(this,"still in work,choose other option",Toast.LENGTH_SHORT).show()
        }
        box3.setOnClickListener {
            count =3
            default_colors()
            box3.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            Toast.makeText(this,"still in work,choose other option",Toast.LENGTH_SHORT).show()

        }
        box4.setOnClickListener {
            count =4
            default_colors()
            box4.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
            Toast.makeText(this,"still in work,choose other option",Toast.LENGTH_SHORT).show()
        }

    }
    fun default_colors()
    {
        val online_class=findViewById<TextView>(R.id.online_class_view)
        val box2=findViewById<TextView>(R.id.Box2)
        val box3=findViewById<TextView>(R.id.Box3)
        val box4=findViewById<TextView>(R.id.Box4)
        online_class.setBackgroundColor(Color.parseColor("#FFBC19"))
        box2.setBackgroundColor(Color.parseColor("#FFBC19"))
        box3.setBackgroundColor(Color.parseColor("#FFBC19"))
        box4.setBackgroundColor(Color.parseColor("#FFBC19"))
    }
}

