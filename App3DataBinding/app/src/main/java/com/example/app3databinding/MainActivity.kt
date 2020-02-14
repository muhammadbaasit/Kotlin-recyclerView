package com.example.app3databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app3databinding.databinding.RcLayoutBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding= DataBindingUtil.setContentView<RcLayoutBinding>(this,R.layout.activity_main)



        val recyclerView: RecyclerView = findViewById(R.id.rcView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        var userList = ArrayList<User>()

        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))
        userList.add(User("bob","dieny"))


        val adapter= RcAdapter(this,userList)

        recyclerView.adapter = adapter
    }
}
