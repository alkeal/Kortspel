package com.example.kortspel

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {


  lateinit var textAppNameView: TextView
  lateinit var imageView: ImageView
  lateinit var textPointsView: TextView


  private val cardImages : IntArray = intArrayOf(

      R.drawable.card1,
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

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var savedCardValue = getIntent()

        var cardValue = savedCardValue.getIntExtra("LastCardValue",-1)
        if(cardValue == -1){
            cardValue = 1

        }
            Log.d("!!!",cardValue.toString())

        var points = savedCardValue.getIntExtra("LastPoint",0)
        textPointsView = findViewById(R.id.textPointsView)
        textAppNameView = findViewById(R.id.textAppNameView)

         val buttonLower = findViewById<Button>(R.id.buttonLower)

         val buttonHigher = findViewById<Button>(R.id.buttonHigher)
        val random = kotlin.random.Random
        imageView = findViewById(R.id.imageCardView)
        imageView.setImageResource(cardImages[cardValue-1])


        textPointsView.text = "Dina poäng: " + points.toString()
        buttonLower.setOnClickListener {
            // 0 = fel , 1 = rätt
            var answer = 0
           val intent = Intent(this,AnswerActivity::class.java)
           val randomValue = random.nextInt(1,cardImages.size)
            if ( randomValue < cardValue){
                answer = 1
                points = points + 1
                intent.putExtra("LastPoint",points)
            }

            intent.putExtra("AnswerLower",answer)
            cardValue = randomValue
            imageView.setImageResource(cardImages[cardValue-1])
            intent.putExtra("CardValue",cardValue)

            startActivity(intent)


        }

        buttonHigher.setOnClickListener {
            var answer = 0

            val intent = Intent(this,AnswerActivity::class.java)
            val randomValue = random.nextInt(1,cardImages.size)
            Log.d("random",randomValue.toString())

            if ( randomValue > cardValue){
                  answer = 1
                points = points + 1
                intent.putExtra("LastPoint",points)
            }

            intent.putExtra("AnswerHigher",answer)
            cardValue = randomValue
            imageView.setImageResource(cardImages[cardValue-1])
            intent.putExtra("CardValue",cardValue)

            startActivity(intent)

        }

        textAppNameView.setOnClickListener {

            textAppNameView.animate().apply {

                duration = 1000
                rotationYBy(360f)
            } .withEndAction{
                textAppNameView.animate().apply {
                    duration = 1000
                    rotationXBy(3600f)

                }.start()
            }


        }




        }




}