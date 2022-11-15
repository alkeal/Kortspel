package com.example.kortspel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import java.util.*
import java.util.Random

class MainActivity : AppCompatActivity() {


  lateinit var textAppNameView: TextView
  lateinit var imageView: ImageView

  val cardImages : IntArray = intArrayOf(

      R.drawable.card7,
      R.drawable.card2,
      R.drawable.card3,
      R.drawable.card4,
      R.drawable.card5,
      R.drawable.card6,
      R.drawable.card7,
      R.drawable.card8,
      R.drawable.card9,
      R.drawable.card10,
      R.drawable.card11,
      R.drawable.card12,
      R.drawable.card13,
  )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         textAppNameView = findViewById(R.id.textAppNameView)

         val buttonLower = findViewById<Button>(R.id.buttonLower)

         val buttonHigher = findViewById<Button>(R.id.buttonHigher)

         var cardValue = 1
        val random = kotlin.random.Random
        imageView = findViewById(R.id.imageCardView)

        buttonLower.setOnClickListener {
            // 0 = av , 1 = på
            var answer = 0
           val intent = Intent(this,AnswerActivity::class.java)
           val randomValue = random.nextInt(cardImages.size)
            if ( randomValue < cardValue){
                answer = 1
            }
            intent.putExtra("AnswerLower",answer)
            cardValue = randomValue
            imageView.setImageResource(cardImages[cardValue-1])

            startActivity(intent)
           // buttonPressed()

        }

        buttonHigher.setOnClickListener {
            var answer = 0
            val intent = Intent(this,AnswerActivity::class.java)
            val randomValue = random.nextInt(cardImages.size)

            if ( randomValue > cardValue){
                  answer = 1
            }

            intent.putExtra("AnswerHigher",answer)
            cardValue = randomValue
            imageView.setImageResource(cardImages[cardValue-1])

             startActivity(intent)

            buttonPressed()
        }






    }

    fun buttonPressed(){








    }
}