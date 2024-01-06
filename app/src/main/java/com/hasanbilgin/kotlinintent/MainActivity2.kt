package com.hasanbilgin.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hasanbilgin.kotlinintent.databinding.ActivityMain2Binding
import com.hasanbilgin.kotlinintent.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {


    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)


        //getIntent
        val intent = intent
        val username = intent.getStringExtra( "username")
        val name = intent.getStringExtra(  "name")
        binding.usernameTextview.text = "Username: "  +username
       binding.nameTextview.text = "Name: " + name

        
    }



}                                  