package com.example.interactivedicesv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val d6roll = findViewById<Button>(R.id.roll6)
        d6roll.setOnClickListener {

            Toast.makeText(this,"Rolling Your Luck", Toast.LENGTH_SHORT).show()
            rollDice6(6)

        }

    }

    fun rollDice6(sides:Int){

        val sideN6 = (1..sides).random()
        val resultOfRoll6 = findViewById<TextView>(R.id.diceRollResult)
        resultOfRoll6.text = sideN6.toString()
        val luck = findViewById<TextView>(R.id.luck)

        if(sideN6 == 1){

            luck.text = "Ohhh Bad Lucky"

        }else if(sideN6 == 6){

            luck.text = "WoW Sooo Lucky"

        }else {luck.text = ""}

    }
}