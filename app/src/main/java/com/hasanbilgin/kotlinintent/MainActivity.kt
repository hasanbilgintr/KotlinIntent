package com.hasanbilgin.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hasanbilgin.kotlinintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        println("on create called")
    }


    override fun onResume() {
        super.onResume()
        println("on resume called")
    }

    override fun onPause() {
        super.onPause()
        println("on pause called")
    }

    override fun onStop() {
        super.onStop()
        println("on stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("on destroy called")

    }


    fun nextOnClick(view: View) {
        val intent = Intent(applicationContext, MainActivity2::class.java)
        intent.putExtra("username", binding.usernameEdittext.text.toString())
        intent.putExtra("name", binding.nameEdittext.text.toString())
        startActivity(intent)
        finish()
    }
}