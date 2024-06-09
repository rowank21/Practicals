package com.example.practicals


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var btnStart: Button
    private lateinit var btnExit: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        btnStart = findViewById(R.id.btnStart)
        btnExit = findViewById(R.id.btnExit)

        btnStart.setOnClickListener {
            navigateToMain()
        }

        btnExit.setOnClickListener {
            finish()
        }

        // Automatically navigate to main activity after a delay
        Handler(Looper.getMainLooper()).postDelayed({
            navigateToMain()
        }, 3000) // 3 seconds delay
    }

    private fun navigateToMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Do nothing to disable the back button
    }
}
