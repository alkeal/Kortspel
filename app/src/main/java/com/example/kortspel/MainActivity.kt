package com.example.kortspel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


  lateinit var textAppNameView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
         textAppNameView = findViewById(R.id.textAppNameView)

         val buttonLower = findViewById<Button>(R.id.buttonLower)

         val buttonHigher = findViewById<Button>(R.id.buttonHigher)

        buttonLower.setOnClickListener {
            val intent = Intent(this,AnswerActivity)
            startActivity(intent)
        }

        buttonHigher.setOnClickListener {
            val intent = Intent(this,AnswerActivity)
            startActivity(intent)

        }




    }
}