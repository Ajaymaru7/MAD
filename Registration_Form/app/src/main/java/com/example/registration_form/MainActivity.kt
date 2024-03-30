
package com.example.registration_form

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPhone: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPhone = findViewById(R.id.editTextPhone)

        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val buttonReset = findViewById<Button>(R.id.buttonReset)

        buttonSubmit.setOnClickListener {
            submitForm()
        }

        buttonReset.setOnClickListener {
            resetForm()
        }
    }

    private fun submitForm() {
        val name = editTextName.text.toString().trim()
        val email = editTextEmail.text.toString().trim()
        val phone = editTextPhone.text.toString().trim()

        if (name.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty()) {

            Toast.makeText(this, "Form submitted successfully", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
        }
    }

    private fun resetForm() {
        editTextName.text.clear()
        editTextEmail.text.clear()
        editTextPhone.text.clear()
    }
}
