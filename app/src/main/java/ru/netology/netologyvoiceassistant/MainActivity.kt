package ru.netology.netologyvoiceassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG: String = "MainActivity"
        Log.d(TAG, "start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String = "Ivan"
        val surname: String = "Ivanov"
        val age: Int = 37
        val height: Double = 172.2
        val output: TextView = findViewById(R.id.output)
        Log.d (TAG, "Writing log for "+name)

        output.text = "name: " + name + " surname: " + surname + " age: " + age + " height: " + height
        Log.d(TAG, "end of onCreate function")
    }
}