package com.momatstudio.workdone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val dashboard: Button = findViewById<Button>(R.id.dashboardBtn)
        val button1: Button = findViewById<Button>(R.id.screenOneBtn)
        val button3: Button = findViewById<Button>(R.id.screenThreeBtn)

        dashboard.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent)
        }

        button1.setOnClickListener {
            val intent: Intent = Intent(this, screen1::class.java)
            this.startActivity(intent)
        }

        button3.setOnClickListener {
            val intent: Intent = Intent(this, screen3::class.java)
            this.startActivity(intent)
        }
    }
}