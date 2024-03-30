import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.numeric_keyboard.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numericEditText = findViewById<EditText>(R.id.numericEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val displayButton = findViewById<Button>(R.id.displayButton)

        displayButton.setOnClickListener {
            val numericValue = numericEditText.text.toString()
            val passwordValue = passwordEditText.text.toString()

            val message = "Numeric Value: $numericValue\nPassword: $passwordValue"
            Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
        }
    }
}
