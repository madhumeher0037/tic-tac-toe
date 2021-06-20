package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class quiz_page : AppCompatActivity(),View.OnClickListener{
    private  var listofquestion : ArrayList<Questions>? =null
    private  var listofId : ArrayList<TextView>?=null
    lateinit var question : TextView
    lateinit var op1 :TextView
    lateinit var op2 :TextView
    lateinit var op3 :TextView
    lateinit var op4 :TextView
    var currentposition : Int =0
    var pg = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_page)
        var end : Button = findViewById(R.id.btn2)
        var back : Button = findViewById(R.id.btn3)
        var next : Button = findViewById(R.id.btn4)

        end.setOnClickListener()
        {
            var pop_win = PopupWindow(this)
            val view = layoutInflater.inflate(R.layout.activity_pop_window,null)
            pop_win.contentView =view
            pop_win.showAtLocation(it,Gravity.CENTER,0,1)
        }
        var temp = Utility()
        listofquestion=temp.getQuestion()
        question = findViewById(R.id.question)
        op1 = findViewById(R.id.opt1)
        op2 = findViewById(R.id.opt2)
        op3 = findViewById(R.id.opt3)
        op4 = findViewById(R.id.opt4)
        next.setOnClickListener()
        {
            currentposition++
            pg++
            if(currentposition> listofquestion!!.size-1)
            {

                currentposition=listofquestion!!.size-1
                pg=9;
                Toast.makeText(this,"questions are over",Toast.LENGTH_LONG).show()
            }
            else {
                checkifselected(currentposition)
                setProgress()
                setQuestion()
            }
        }
        back.setOnClickListener()
        {
            currentposition--
            pg--
            if(currentposition>-1 && pg>-1)
            {

                checkifselected(currentposition)
                setProgress()
                setQuestion()
            }
            else{
                currentposition=0
                pg = 0
                setProgress()
                setQuestion()
                defaultBorder()
            }
        }
        setProgress()
        setQuestion()
        op1.setOnClickListener(this)
        op2.setOnClickListener(this)
        op3.setOnClickListener(this)
        op4.setOnClickListener(this)
    }
    fun checkifselected(x : Int)
    {
        if(listofId!!.get(x).toString().isEmpty())
        {
            defaultBorder()
        }
        if(listofId!!.get(x)==op1)
        {
            selectedoption(op1,R.drawable.selected_option_border_color)
        }
        else if(listofId!!.get(x)==op2)
        {
            selectedoption(op2,R.drawable.selected_option_border_color)
        }
        else if(listofId!!.get(x)==op3)
        {
            selectedoption(op3,R.drawable.selected_option_border_color)
        }
        else if(listofId!!.get(x)==op4)
        {
            selectedoption(op4,R.drawable.selected_option_border_color)
        }
        else
        {
            defaultBorder()
        }
    }
    override fun onClick(v: View) {
        when(v.id)
        {
            R.id.opt1 ->
            {
                listofId?.set(currentposition, op1)
                listofId?.let { Log.d("id", it.get(currentposition).toString()) }
                selectedoption(op1,R.drawable.selected_option_border_color)
            }
            R.id.opt2 ->
            {
                listofId?.set(currentposition, op2)
                selectedoption(op2,R.drawable.selected_option_border_color)
            }
            R.id.opt3 ->
            {
                listofId?.set(currentposition, op3)
                selectedoption(op3,R.drawable.selected_option_border_color)
            }
            R.id.opt4 ->
            {
                listofId?.set(currentposition, op4)
                selectedoption(op4,R.drawable.selected_option_border_color)
            }
        }
    }
    fun selectedoption(tv : TextView,id : Int)
    {
        defaultBorder()
        tv.background = ContextCompat.getDrawable(this,id)
    }
    fun defaultBorder()
    {
        op1.background =ContextCompat.getDrawable(this,R.drawable.default_option_border_color)
        op2.background =ContextCompat.getDrawable(this,R.drawable.default_option_border_color)
        op3.background =ContextCompat.getDrawable(this,R.drawable.default_option_border_color)
        op4.background =ContextCompat.getDrawable(this,R.drawable.default_option_border_color)
    }
    fun setProgress()
    {
        var progressbar : ProgressBar = findViewById(R.id.pg1)
        progressbar.setProgress(pg)
    }
    fun setQuestion()
    {
        var questionObject = listofquestion!!.get(currentposition)
        question.setText(questionObject.question)
        op1.setText(questionObject.opt1)
        op2.setText(questionObject.opt2)
        op3.setText(questionObject.opt3)
        op4.setText(questionObject.opt4)
    }
}

