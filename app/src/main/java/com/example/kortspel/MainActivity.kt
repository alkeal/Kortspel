package com.example.kortspel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {


  lateinit var textAppNameView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         textAppNameView = findViewById(R.id.textAppNameView)

         val buttonLower = findViewById<Button>(R.id.buttonLower)

         val buttonHigher = findViewById<Button>(R.id.buttonHigher)

        buttonLower.setOnClickListener {
            val intent = Intent(this,AnswerActivity::class.java)

            startActivity(intent)
            buttonPressed()
        }

        buttonHigher.setOnClickListener {
            val intent = Intent(this,AnswerActivity::class.java)

            startActivity(intent)
            buttonPressed()
        }




    }

    fun buttonPressed (){










    }
}