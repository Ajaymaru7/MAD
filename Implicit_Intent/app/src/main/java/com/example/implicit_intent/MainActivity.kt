package com.example.implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openWebButton = findViewById<Button>(R.id.openWebButton)

        openWebButton.setOnClickListener {

            val webpage: Uri = Uri.parse("https://www.example.com")
            val intent = Intent(Intent.ACTION_VIEW, webpage)

            if (intent.resolveActivity(packageManager) != null) {

                startActivity(intent)
            }
        }
    }
}
