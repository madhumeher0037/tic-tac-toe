package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var gamestate = arrayOf(0,0,0,0,0,0,0,0,0)
    var Active_player = 1
    var activegame = true
    var winningPos = arrayOf(arrayOf(0,1,2),arrayOf(3,4,5),arrayOf(6,7,8),arrayOf(0,3,6),arrayOf(1,4,7),arrayOf(2,5,8),arrayOf(0,4,8),arrayOf(2,4,6))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun coinAppear(view: View)
    {
        val img: ImageView = view as ImageView
        var tag:Int = img.getTag().toString().toInt()
        Log.i("Tag"," is :$tag")
        if(gamestate[tag]==0 && activegame)
        {
            gamestate[tag]=Active_player
            if(Active_player == 1)
            {
                img.setImageResource(R.drawable.black)
                Active_player=2
            }
            else
            {
                img.setImageResource(R.drawable.white)
                Active_player=1
            }
        }
        for (pos in winningPos)
        {
            if(gamestate[pos[0]]!=0 && gamestate[pos[0]]==gamestate[pos[1]] && gamestate[pos[1]]==gamestate[pos[2]]) {
                activegame=false
                if (Active_player==1) {
                    val result : TextView = findViewById(R.id.result)
                    result.setText("White Won")
                    result.visibility =View.VISIBLE
                } else {
                    val result : TextView = findViewById(R.id.result)
                    result.setText("Black Won")
                    result.visibility =View.VISIBLE
                }
                val playagain : Button = findViewById(R.id.button2)
                playagain.visibility = View.VISIBLE
            }


        }
    }
    fun playagain(view :View)
    {
        val result : TextView = findViewById(R.id.result)
        val playagain1 : Button = findViewById(R.id.button2)
        playagain1.visibility = View.INVISIBLE
        result.visibility =View.INVISIBLE
        gamestate = arrayOf(0,0,0,0,0,0,0,0,0)
        Active_player = 1
        activegame = true
        val num = listOf<Int>(1,2,3,4,5,6,7,8,9)
        for (i in num)
        {
            val buttonid = "imgv" + i
            val resid = getResources().getIdentifier(buttonid, "id", getPackageName())
            val img : ImageView = findViewById(resid)
            img.setImageDrawable(null)
        }
    }
}
