package com.example.kalkulatorbmi

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            val waga = findViewById<TextView>(R.id.kg).text.toString().toDouble()
            val wzrost = findViewById<TextView>(R.id.cm).text.toString().toDouble() / 100

            val wynik = waga / (wzrost * wzrost)

            findViewById<TextView>(R.id.wynik).text =
                String.format("%.2f", wynik)
        }

    }
}