package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class verification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)
        val user_name = findViewById<EditText>(R.id.user_name)
        val user_age = findViewById<EditText>(R.id.user_age)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup_1)
        val button = findViewById<Button>(R.id.button_2)
        button.setOnClickListener{
            val temp1 : Int =user_age.text.toString().toInt()
            val temp2 : String =user_name.text.toString()
            if(temp1>18)
            {
                    Toast tost = Toast.makeText(applicationContext,temp2.uppercase(),Toast.LENGTH_LONG)
                    View view = toast.getView()
            }
            else
            {
                    Toast.makeText(applicationContext,"person is minor",Toast.LENGTH_LONG).show()
            }
        }
    }
}