package com.example.homeactivity

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class class_details(val items_subs:ArrayList<String>,val items_time:ArrayList<String>):RecyclerView.Adapter<class_details_viewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): class_details_viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.class_item,parent,false)
        return class_details_viewholder(view)
    }

    override fun onBindViewHolder(holder: class_details_viewholder, position: Int) {
                val item_contain1 = items_subs[position]
                holder.sub.text = item_contain1
                val item_contain2 = items_time[position]
                holder.tym.text = item_contain2
                val str:String = "https://meet.google.com/"
                val uri:Uri = Uri.parse(str)
                holder.btn.setOnClickListener(){
                    val x:clickdetails=clickdetails()
                    x.invoke()
                }
    }


    override fun getItemCount(): Int {
        return items_subs.size
    }
}
class class_details_viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val sub:TextView = itemView.findViewById(R.id.subject)
    val tym:TextView = itemView.findViewById(R.id.time)
    val btn:ImageButton = itemView.findViewById(R.id.btn1)
}