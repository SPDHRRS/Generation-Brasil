package com.example.interactivedicesv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val d20roll = findViewById<Button>(R.id.roll20)
        d20roll.setOnClickListener {

            Toast.makeText(this,"Rolling Your Luck", Toast.LENGTH_SHORT).show()
            rollDice20(20)

        }

    }
    fun rollDice20(sides:Int){

        val sideN20 = (1..sides).random()
        val resultOfRoll20 = findViewById<TextView>(R.id.diceRollResult3)
        resultOfRoll20.text = sideN20.toString()
        val luck3 = findViewById<TextView>(R.id.luck3)

        if(sideN20 == 1){

            luck3.text = "Ohhh Critical Failure"

        }else if(sideN20 == 20){

            luck3.text = "WoW CRITICAL!"

        }else {luck3.text = ""}

    }

}