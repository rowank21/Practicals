package com.example.practicals

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val screenTimes = mutableListOf<Triple<String, String, String>>()

    private lateinit var btnAdd: Button
    private lateinit var btnViewDetails: Button
    private lateinit var btnClear: Button
    private lateinit var etDay: EditText
    private lateinit var etMorning: EditText
    private lateinit var etAfternoon: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnViewDetails = findViewById(R.id.btnViewDetails)
        btnClear = findViewById(R.id.btnClear)
        etDay = findViewById(R.id.etDay)
        etMorning = findViewById(R.id.etMorning)
        etAfternoon = findViewById(R.id.etAfternoon)

        btnAdd.setOnClickListener {
            val day = etDay.text.toString()
            val morning = etMorning.text.toString()
            val afternoon = etAfternoon.text.toString()

            if (day.isNotEmpty() && morning.isNotEmpty() && afternoon.isNotEmpty()) {
                screenTimes.add(Triple(day, morning, afternoon))
                etDay.text.clear()
                etMorning.text.clear()
                etAfternoon.text.clear()
                Toast.makeText(this, "Screen time added", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter valid data", Toast.LENGTH_SHORT).show()
            }
        }

        btnViewDetails.setOnClickListener {
            val intent = Intent(this, DetailedViewActivity::class.java)
            intent.putExtra("screenTimes", ArrayList(screenTimes))
            startActivity(intent)
        }

        btnClear.setOnClickListener {
            screenTimes.clear()
            etDay.text.clear()
            etMorning.text.clear()
            etAfternoon.text.clear()
            Toast.makeText(this, "Screen times cleared", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        moveTaskToBack(true) // back button must not interfere with activity
    }
}
