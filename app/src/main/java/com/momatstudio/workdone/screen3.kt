package com.momatstudio.workdone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)

        val dashboard = findViewById<Button>(R.id.dashboardBtn)
        val button1 = findViewById<Button>(R.id.screenOneBtn)
        val button2 = findViewById<Button>(R.id.screenTwoBtn)

        dashboard.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent)
        }

        button1.setOnClickListener {
            val intent: Intent = Intent(this, screen1::class.java)
            this.startActivity(intent)
        }

        button2.setOnClickListener {
            val intent: Intent = Intent(this, screen2::class.java)
            this.startActivity(intent)
        }
    }
}