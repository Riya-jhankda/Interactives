package com.example.interactives

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_read=findViewById<Button>(R.id.read)
        val btn_dark=findViewById<Button>(R.id.dark)
        val layouts=findViewById<LinearLayout>(R.id.ll)

        btn_read.setOnClickListener {
            layouts.setBackgroundResource(R.color.fade)
        }

        btn_dark.setOnClickListener {
            layouts.setBackgroundResource(R.color.grey)
        }

    }
}