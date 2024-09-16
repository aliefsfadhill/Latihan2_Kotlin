package com.alief.latihan5mobileapps

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GanjilGenap : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ganjil_genap)

        val etBil = findViewById<EditText>(R.id.etBil)
        val btnpres = findViewById<Button>(R.id.btnPress)
        val tampil = findViewById<TextView>(R.id.tvTampil)

        btnpres.setOnClickListener {
            val angka = etBil.text.toString().toIntOrNull()

            if (angka != null){
                if (angka % 2==0){
                    tampil.text="$angka adalah Bilangan Genap"
                }else{
                    tampil.text="$angka adalah Bilangan Ganjil"
                }
            }else{

            }
        }

        val ActButtonn = findViewById<Button>(R.id.btnhome)
        ActButtonn.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}