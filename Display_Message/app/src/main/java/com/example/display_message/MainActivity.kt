package com.example.display_message

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeButton = findViewById<Button>(R.id.welcomeButton)
        welcomeButton.setOnClickListener {
            displayWelcomeMessage()
        }
    }

    private fun displayWelcomeMessage() {
        val message = "Welcome to the App!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, message, duration)
        toast.show()
    }
}
