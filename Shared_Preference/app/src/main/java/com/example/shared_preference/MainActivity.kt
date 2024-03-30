package com.example.shared_preference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        val buttonSave = findViewById<Button>(R.id.buttonSave)

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        editText.setText(sharedPreferences.getString("text", ""))

        buttonSave.setOnClickListener {
            val textToSave = editText.text.toString()
            val editor = sharedPreferences.edit()
            editor.putString("text", textToSave)
            editor.apply()
        }
    }
}
