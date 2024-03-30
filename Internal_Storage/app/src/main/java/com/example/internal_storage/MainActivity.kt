package com.example.internal_storage

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {

    private val fileName = "sample_file.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val buttonSave = findViewById<Button>(R.id.buttonSave)
        val buttonLoad = findViewById<Button>(R.id.buttonLoad)
        val textView = findViewById<TextView>(R.id.textView)

        buttonSave.setOnClickListener {
            val textToSave = editText.text.toString()
            saveToFile(textToSave)
        }

        buttonLoad.setOnClickListener {
            val loadedText = readFromFile()
            textView.text = loadedText
        }
    }

    private fun saveToFile(text: String) {
        try {
            val outputStream: FileOutputStream = openFileOutput(fileName, Context.MODE_PRIVATE)
            outputStream.write(text.toByteArray())
            outputStream.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun readFromFile(): String {
        var text = ""
        try {
            val inputStream: FileInputStream = openFileInput(fileName)
            val inputStreamReader = InputStreamReader(inputStream)
            val bufferedReader = BufferedReader(inputStreamReader)
            val stringBuilder = StringBuilder()
            var line: String?
            while (bufferedReader.readLine().also { line = it } != null) {
                stringBuilder.append(line)
            }
            inputStream.close()
            text = stringBuilder.toString()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return text
    }
}
