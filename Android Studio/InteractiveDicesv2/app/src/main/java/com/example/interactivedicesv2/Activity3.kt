package com.example.interactivedicesv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val d12roll = findViewById<Button>(R.id.roll12)
        d12roll.setOnClickListener {

            Toast.makeText(this,"Rolling Your Luck", Toast.LENGTH_SHORT).show()
            rollDice12(12)

        }

    }
    fun rollDice12(sides:Int){

        val sideN12 = (1..sides).random()
        val resultOfRoll12 = findViewById<TextView>(R.id.diceRollResult2)
        resultOfRoll12.text = sideN12.toString()
        val luck2 = findViewById<TextView>(R.id.luck2)

        if(sideN12 == 1){

            luck2.text = "Ohhh Bad Lucky"

        }else if(sideN12 == 12){

            luck2.text = "WoW Sooo Lucky"

        }else {luck2.text = ""}

    }

}