package com.example.kortspel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView

class AnswerActivity : AppCompatActivity() {


    lateinit var imageRightView: ImageView
    lateinit var imageWrongView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

    imageRightView = findViewById(R.id.imageRightView)
    imageWrongView = findViewById(R.id.imageWrongView)

   //val intent = Intent(this,MainActivity::class.java)
        var intent : Intent
        intent = getIntent()
        var higherCard = intent.getIntExtra("AnswerHigher",-1)
        var lowerCard = intent.getIntExtra("AnswerLower",-1)
        if (higherCard != -1){
            if(higherCard == 1){
              imageWrongView.visibility = View.GONE
              imageRightView.visibility = View.VISIBLE
          } else {
              imageWrongView.visibility = View.VISIBLE
              imageRightView.visibility = View.GONE
          }

        }
        else if (lowerCard != -1){
            if(lowerCard == 1){
                imageWrongView.visibility = View.GONE
                imageRightView.visibility = View.VISIBLE
            } else {
                imageWrongView.visibility = View.VISIBLE
                imageRightView.visibility = View.GONE
            }


   }

}



}