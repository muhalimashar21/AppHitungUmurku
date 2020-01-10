package com.example.apphitungumurmu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvUmurmu.visibility = View.INVISIBLE

        btnHitungUmurmu.setOnClickListener {
            //mendapatkan tahun saat ini
            val currYear = Calendar.getInstance().get(Calendar.YEAR)
            //Hitung (tahun ini - tahun lahir)
            val userAge = currYear - etTahunLahir.text.toString().toInt()
            //Set hasil ke text view
            tvUmurmu.text = "Umur mu adalah : $userAge Tahun"
            //tampilkan text hasil
            tvUmurmu.visibility = View.VISIBLE
        }
    }
}
