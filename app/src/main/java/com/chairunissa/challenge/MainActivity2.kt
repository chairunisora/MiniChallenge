package com.chairunissa.challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    lateinit var inputNamaEditText : EditText
    lateinit var goToScreen3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        inputNamaEditText = findViewById(R.id.input_nama_edit_text)
        goToScreen3 = findViewById(R.id.go_to_screen3_button)

        goToScreen3.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            //untuk mengirim
            intent.putExtra("nama", inputNamaEditText.text.toString())

            startActivity(intent)
        }
    }
}