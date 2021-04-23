package kg.tutorialapp.weather

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Activity3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        setupView()
    }

    private fun setupView() {
        val butt = findViewById<Button>(R.id.button16)
        val text = findViewById<EditText>(R.id.PersonName)

        butt.setOnClickListener {

            val intent = Intent(this,Lesson32::class.java)
            intent.putExtra("String", text.text.toString())
            startActivity(intent)
        }
    }
}