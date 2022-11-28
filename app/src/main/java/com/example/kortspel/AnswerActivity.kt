package com.example.kortspel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.core.graphics.alpha
import kotlin.random.Random

class AnswerActivity : AppCompatActivity() {

    lateinit var intentValue : Intent


    lateinit var imageRightView: ImageView
    lateinit var imageWrongView: ImageView
    lateinit var textWrongView: TextView
    lateinit var textRightView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

    imageRightView = findViewById(R.id.imageRightView)
    imageWrongView = findViewById(R.id.imageWrongView)

        textRightView = findViewById(R.id.textRightView)
        textWrongView = findViewById(R.id.textWrongView)

        intent = getIntent()
        var higherCard = intent.getIntExtra("AnswerHigher",-1)
        var lowerCard = intent.getIntExtra("AnswerLower",-1)
        if (higherCard != -1){
            if(higherCard == 1){
              imageWrongView.visibility = View.GONE
              imageRightView.visibility = View.VISIBLE
                textWrongView.visibility = View.GONE
                textRightView.visibility = View.VISIBLE
          } else {
              imageWrongView.visibility = View.VISIBLE
              imageRightView.visibility = View.GONE
                textWrongView.visibility = View.VISIBLE
                textRightView.visibility = View.GONE
            }

        }
        else if (lowerCard != -1){
            if(lowerCard == 1){
                imageWrongView.visibility = View.GONE
                imageRightView.visibility = View.VISIBLE
                textWrongView.visibility = View.GONE
                textRightView.visibility = View.VISIBLE

            } else {
                imageWrongView.visibility = View.VISIBLE
                imageRightView.visibility = View.GONE
                textWrongView.visibility = View.VISIBLE
                textRightView.visibility = View.GONE
            }

   }
   if (higherCard != -1|| lowerCard != -1){
        var savedCardValue = intent.getIntExtra("CardValue", -1)
         var savedPointsValue = intent.getIntExtra("LastPoint",0)
       restartGame(savedCardValue, savedPointsValue)


   }

    }




fun restartGame(cardValue : Int, points : Int ){

   if (cardValue != -1){

   val buttonRestart = findViewById<Button>(R.id.buttonRestart)
   buttonRestart.setOnClickListener {

        val intent = Intent(this,MainActivity::class.java)
       intent.putExtra("LastCardValue", cardValue)
       intent.putExtra("LastPoint",points)
       startActivity(intent)



        }

   }



    imageRightView.setOnClickListener {

       imageRightView.animate().apply {

            duration = 1000
            rotationXBy(360f)
        } .start()


       }
            imageWrongView.setOnClickListener {

              imageWrongView.animate().apply {

                    duration = 1000
                    rotationYBy(360f)
                } .start()

              }


    }


    }





