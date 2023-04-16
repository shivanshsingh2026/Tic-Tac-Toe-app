package com.example.tictactoeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var flag = 0
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SuspiciousIndentation")
    fun click(view: View) {
        val CurButton = view as Button

            count++
            if (CurButton.text == "")
                if (flag == 0) {
                    CurButton.text = "X"
                    flag = 1
                } else {
                    CurButton.text = "O"
                    flag = 0
                }
            val b1 = findViewById<Button>(R.id.btn1).text.toString()
            val b2 = findViewById<Button>(R.id.btn2).text.toString()
            val b3 = findViewById<Button>(R.id.btn3).text.toString()
            val b4 = findViewById<Button>(R.id.btn4).text.toString()
            val b5 = findViewById<Button>(R.id.btn5).text.toString()
            val b6 = findViewById<Button>(R.id.btn6).text.toString()
            val b7 = findViewById<Button>(R.id.btn7).text.toString()
            val b8 = findViewById<Button>(R.id.btn8).text.toString()
            val b9 = findViewById<Button>(R.id.btn9).text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b4 == b5 && b5 == b6 && b6 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b4", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b7", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b2", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b3", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                NewGame()
            } else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b3", Toast.LENGTH_LONG).show()
                NewGame()
            } else if(count==9){
                Toast.makeText(this@MainActivity, "Match is Drawn", Toast.LENGTH_LONG).show()
                NewGame()

            }


    }
    fun NewGame(){
        findViewById<Button>(R.id.btn1).text = ""
        findViewById<Button>(R.id.btn2).text = ""
        findViewById<Button>(R.id.btn3).text = ""
        findViewById<Button>(R.id.btn4).text = ""
        findViewById<Button>(R.id.btn5).text = ""
        findViewById<Button>(R.id.btn6).text = ""
        findViewById<Button>(R.id.btn7).text = ""
        findViewById<Button>(R.id.btn8).text = ""
        findViewById<Button>(R.id.btn9).text = ""
        count =0
        flag = 0

    }
}