package kg.tutorialapp.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Lesson32 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson32)

        val text3 = findViewById<TextView>(R.id.textView4)

        val textFromIntent = intent.getStringExtra("String")
        text3.text = textFromIntent.toString()
    }
}


