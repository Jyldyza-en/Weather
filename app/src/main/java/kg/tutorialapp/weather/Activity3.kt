package kg.tutorialapp.weather

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Activity3: AppCompatActivity() {

    val TAG = "LIFECYCLE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        setupView()
        Log.d(TAG, "Activity onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Activity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Activity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Activity onDestroy")
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