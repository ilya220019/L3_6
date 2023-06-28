package com.example.l3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container, OneFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.second_container, SecondFragment()).commit()
    }
}