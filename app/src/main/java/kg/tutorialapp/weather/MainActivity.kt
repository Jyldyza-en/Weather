package kg.tutorialapp.weather


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //примеры из 24 урока
        var text1 = findViewById<TextView>(R.id.textView)
        text1.text = getString(R.string.greeting)

        var edit = findViewById<EditText>(R.id.editText)

        text1.setOnClickListener {
            text1.text = edit.text
        }

    }

    fun onClick() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }


}