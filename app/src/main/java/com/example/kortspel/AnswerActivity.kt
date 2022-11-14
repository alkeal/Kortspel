package com.example.kortspel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AnswerActivity : AppCompatActivity() {


    lateinit var imageRightView: ImageView
    lateinit var imageWrongView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

    imageRightView = findViewById(R.id.imageRightView)
    imageWrongView = findViewById(R.id.imageWrongView)




    }
}