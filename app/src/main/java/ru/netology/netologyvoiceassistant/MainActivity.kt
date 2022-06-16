package ru.netology.netologyvoiceassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    fun initViews() {
        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_stop -> {
                Log.d(TAG, "Stop pressed")
            }
            R.id.action_clear -> {
                Log.d(TAG, "Clear pressed")
            }
        }
        return super.onOptionsItemSelected(item)
    }
}