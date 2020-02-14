package com.example.app3databinding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rc_layout.view.*

public class RcAdapter(var context: Context, var userList: ArrayList<User>) : RecyclerView.Adapter<RcAdapter.VHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.rc_layout,parent,false)
        return VHolder(v)
    }

    override fun onBindViewHolder(holder: VHolder, position: Int) {

        val user:User=userList[position]

        holder?.fname.text= user.Fname.toString()

        holder?.lname.text=user.Lname.toString()

    }

    override fun getItemCount(): Int {
        return userList.size
    }


    inner class VHolder(itemView : View) :RecyclerView.ViewHolder(itemView) {

        val fname = itemView.findViewById<TextView>(R.id.fName)
        val lname = itemView.findViewById<TextView>(R.id.lName)
    }
}




