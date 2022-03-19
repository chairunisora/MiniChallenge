package com.chairunissa.challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText

class MainActivity4 : AppCompatActivity() {

    lateinit var inputUsia : EditText
    lateinit var inputAlamat : EditText
    lateinit var inputPekerjaan : EditText
    lateinit var backToScreen3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        inputUsia = findViewById(R.id.input_usia_edit_text)
        inputAlamat = findViewById(R.id.input_alamat_edit_text)
        inputPekerjaan = findViewById(R.id.input_pekerjaan_edit_text)
        backToScreen3 = findViewById(R.id.back_to_screen3_button)

        var passingNama2 = intent.getStringExtra("nama")

        backToScreen3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            val nama = passingNama2.toString()
            val usia = inputUsia.text.toString()
            val alamat = inputAlamat.text.toString()
            val pekerjaan = inputPekerjaan.text.toString()

            intent.putExtra("nama", nama)
            intent.putExtra("usia", usia)
            intent.putExtra("alamat", alamat)
            intent.putExtra("pekerjaan", pekerjaan)

            startActivity(intent)
        }



    }
}