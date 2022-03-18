package com.example.interactivedicesv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d6 = findViewById<ImageButton>(R.id.d6)
        val iD6 = Intent(this, Activity2::class.java)
        d6.setOnClickListener {

            startActivity(iD6)

        }

        val d12 = findViewById<ImageButton>(R.id.d12)
        val iD12 = Intent(this, Activity3::class.java)
        d12.setOnClickListener {

            startActivity(iD12)

        }

        val d20 = findViewById<ImageButton>(R.id.d20)
        val iD20 = Intent(this, Activity4::class.java)
        d20.setOnClickListener {

            startActivity(iD20)

        }
    }
}