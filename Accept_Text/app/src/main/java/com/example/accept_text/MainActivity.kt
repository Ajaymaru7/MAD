import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.accept_text.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputEditText = findViewById<EditText>(R.id.inputEditText)
        val displayButton = findViewById<Button>(R.id.displayButton)
        val displayTextView = findViewById<TextView>(R.id.displayTextView)

        displayButton.setOnClickListener {
            val inputText = inputEditText.text.toString()
            displayTextView.text = inputText
        }
    }
}
