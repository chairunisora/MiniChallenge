package com.chairunissa.challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class MainActivity3 : AppCompatActivity() {

    lateinit var resultNama : TextView
    lateinit var resultUsia : TextView
    lateinit var resultAlamat : TextView
    lateinit var resultPekerjaan : TextView
    lateinit var goToScreen4 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

            resultNama = findViewById(R.id.result_nama_text_view)
            resultUsia = findViewById(R.id.result_usia_text_view)
            resultAlamat = findViewById(R.id.result_alamat_text_view)
            resultPekerjaan = findViewById(R.id.result_pekerjaan_text_view)
            goToScreen4 = findViewById(R.id.go_to_screen4_button)

//        untuk main activity 2
        var passingNama = intent.getStringExtra("nama")
        resultNama.setText(passingNama.toString())

        goToScreen4.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("nama", passingNama.toString())
            startActivity(intent)
        }

//        untuk main activity 4
        var passingNama2 = intent.getStringExtra("nama")
        var passingUsia = intent.getStringExtra("usia")
        var passingAlamat = intent.getStringExtra("alamat")
        var passingPekerjaan = intent.getStringExtra("pekerjaan")

        passingUsia.toString().toInt()
        resultNama.setText(passingNama2.toString())
//        if (passingUsia != null) {
//            if (passingUsia.isEmpty()){
//                if(passingUsia.toString().toInt()%2==0 ){
//                    resultUsia.setText("bilangan genap"+passingUsia.toString())
//                } else{
//                    resultUsia.setText("bilangan ganjil"+passingUsia.toString())
//                }
//            }
//        }

//        resultUsia.setText("bilangan genap"+passingUsia.toString())
        resultAlamat.setText(passingAlamat.toString())
        resultPekerjaan.setText(passingPekerjaan.toString())

    }
}