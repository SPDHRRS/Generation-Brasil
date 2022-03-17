package com.example.interactivedicesexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referencia do Button D20:
        val buttonD20 = findViewById<Button>(R.id.d20roll)

        //Listener de clique -> Fica verificando o momento no qual o usuario der o clique no botao(ROLL)
        //Definir o que ira acontecer no evento de click.

        buttonD20.setOnClickListener {

            Toast.makeText(this,"Rolling your luck", Toast.LENGTH_SHORT).show()
            rollDice20(20)

        }

        val buttonD12 = findViewById<Button>(R.id.d12roll)

        buttonD12.setOnClickListener {

            Toast.makeText(this,"Rolling your luck", Toast.LENGTH_SHORT).show()
            rollDice12(12)

        }

        val buttonD6 = findViewById<Button>(R.id.d6roll)

        buttonD6.setOnClickListener {

            Toast.makeText(this, "Rolling your luck", Toast.LENGTH_SHORT).show()
            rollDice6(6)

        }
    }
    fun rollDice20(sides: Int){

        val sideN20 = (1..sides).random()
        val resultOfRoll20 = findViewById<TextView>(R.id.ResultOfRoll)

        resultOfRoll20.text = sideN20.toString()

    }
    fun rollDice12(sides: Int){

        val sideN12 = (1..sides).random()
        val resultOfRoll12 = findViewById<TextView>(R.id.ResultOfRoll)

        resultOfRoll12.text = sideN12.toString()

    }
    fun rollDice6(sides: Int){

        val sideN6 = (1..sides).random()
        val resultOfRoll6 = findViewById<TextView>(R.id.ResultOfRoll)

        resultOfRoll6.text = sideN6.toString()

    }
}