package com.example.st10456577.tomodachi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonStart = findViewById<Button>(R.id.buttonStart)
        buttonStart.setOnClickListener{
            val intent = intent(this,GameActivity::class.java)
            buttonStart(intent) //Clicking the button sends you to the next page
        }

    }


    }
