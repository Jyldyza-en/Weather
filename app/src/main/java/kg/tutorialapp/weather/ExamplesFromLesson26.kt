package kg.tutorialapp.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class ExamplesFromLesson26 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_examples_from_lesson26)

        val butt = findViewById<Button>(R.id.btn_ok)

        butt.isEnabled = true

        butt.setOnClickListener {
            Toast.makeText(this, getString(R.string.greeting), Toast.LENGTH_LONG).show()
        }

    }

}