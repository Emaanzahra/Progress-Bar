package com.example.progressbbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressbtn = findViewById<Button>(R.id.button)
        val progressbar = findViewById<ProgressBar>(R.id.progressBar)

        progressbtn.setOnClickListener {
            progressbar.visibility = View.VISIBLE

            Handler().postDelayed({
                progressbar.visibility = View.GONE

            },3000)
        }
    }


}