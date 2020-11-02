package com.example.babushka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class asapRocky : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asap_rocky)


        val button1  = findViewById<Button>(R.id.button1)
        button1.setOnClickListener(
            val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}