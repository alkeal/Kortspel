package com.example.kortspel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class AnswerActivity : AppCompatActivity() {


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
   //val intent = Intent(this,MainActivity::class.java)
        var intent : Intent
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

 restartGame()

    }
fun restartGame(){

   val buttonRestart = findViewById<Button>(R.id.buttonRestart)
   buttonRestart.setOnClickListener {


        val intent = Intent(this,MainActivity::class.java)
          super.onPause()
       startActivity(intent)



        }


}


}



