package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Quiz_app : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_app)
        var name : EditText = findViewById(R.id.et1)
        var button : Button = findViewById(R.id.btn1)
        button.setOnClickListener()
        {
            if(name.getText().toString().isEmpty())
            {
                Toast.makeText(this, "enter your name", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var next : Intent = Intent(this,quiz_page::class.java)
                startActivity(next)
            }
        }
    }
}

