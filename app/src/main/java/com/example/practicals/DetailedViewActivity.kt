package com.example.practicals

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedViewActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val screenTimes = intent.getSerializableExtra("screenTimes") as ArrayList<Triple<String, String, String>>
        val textView: TextView = findViewById(R.id.textViewDetails)

        val details = StringBuilder()
        for ((day, morning, afternoon) in screenTimes) {
            details.append("Day: $day\nMorning: $morning\nAfternoon: $afternoon\n\n")
        }

        textView.text = details.toString()
    }
}
