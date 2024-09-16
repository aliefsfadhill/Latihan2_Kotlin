package com.alief.latihan2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class PageKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_kedua)

        val welcomeMessage = findViewById<TextView>(R.id.tvWelcome)
        welcomeMessage.text = "Hello, Selamat Datang Admin"
    }
}
