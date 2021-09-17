package com.momatstudio.workdone

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById<Button>(R.id.screenOneBtn)
        val button2: Button = findViewById<Button>(R.id.screenTwoBtn)
        val button3: Button = findViewById<Button>(R.id.screenThreeBtn)

        button1.setOnClickListener{
            val intent: Intent = Intent(this, screen1::class.java)
            this.startActivity(intent)
        }

        button2.setOnClickListener {
            val intent: Intent = Intent(this, screen2::class.java)
            this.startActivity(intent)
        }

        button3.setOnClickListener {
            val intent: Intent = Intent(this, screen3::class.java)
            this.startActivity(intent)
        }
    }
}