package com.example.external_storage

import android.content.Context
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    private lateinit var editTextInput: EditText
    private lateinit var textViewOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextInput = findViewById(R.id.editTextInput)
        textViewOutput = findViewById(R.id.textViewOutput)
        val buttonWrite = findViewById<Button>(R.id.buttonWrite)
        val buttonRead = findViewById<Button>(R.id.buttonRead)

        buttonWrite.setOnClickListener {
            val inputText = editTextInput.text.toString()
            if (writeToFile(inputText)) {
                Toast.makeText(this, "Data written to file", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Failed to write data to file", Toast.LENGTH_SHORT).show()
            }
        }

        buttonRead.setOnClickListener {
            val outputText = readFromFile()
            textViewOutput.text = outputText
        }
    }

    private fun writeToFile(data: String): Boolean {
        return try {
            val file = File(getExternalFilesDir(null), "example.txt")
            val fos = FileOutputStream(file)
            fos.write(data.toByteArray())
            fos.close()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    private fun readFromFile(): String {
        return try {
            val file = File(getExternalFilesDir(null), "example.txt")
            val inputStream = file.inputStream()
            val outputText = inputStream.bufferedReader().use { it.readText() }
            inputStream.close()
            outputText
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
    }
}
