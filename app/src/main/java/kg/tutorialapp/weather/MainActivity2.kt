package kg.tutorialapp.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun Home() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun Next() {
        val intent3 = Intent(this, ExamplesFromLesson26::class.java)
        startActivity(intent3)
    }
}