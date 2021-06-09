package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val value2 = findViewById<EditText>(R.id.text2)
        val value1= findViewById<EditText>(R.id.text1)
        var result = findViewById<TextView>(R.id.result)
        val button = findViewById<Button>(R.id.button_1)
        val spin = findViewById<Spinner>(R.id.spinner_1)
        var food : String=" "
        button.setOnClickListener{
                val temp: Int = value1.text.toString().toInt()
                val dirt: Int = value2.text.toString().toInt()
                when(spin.selectedItem.toString())
                {
                    "Monday" -> food= "flakes"
                    "tuesday" -> food= "flakes"
                    "Wednesday" -> food= "flakes"
                    "Thursday" -> food= "flakes"
                    "Friday" -> food= "flakes"
                    "Saturday" -> food= "flakes"
                    "Sunday" -> food= "flakes"
                }
                if(isTemperature(temp) || isDirt(dirt) || spin.selectedItem.toString() == "Sunday")
                {
                    result.setText("Change the water and feed the "+food)
                }
                else
                {
                    result.setText(food)
                }
            }
        }
        fun isTemperature(temp : Int) : Boolean= temp>30

        fun isDirt(dirt : Int) : Boolean= dirt>30
    }