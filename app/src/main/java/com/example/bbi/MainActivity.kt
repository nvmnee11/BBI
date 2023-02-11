package com.example.bbi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var Nama: EditText
    private lateinit var TB: EditText
    private lateinit var rPR: RadioButton
    private lateinit var rLK: RadioButton
    private lateinit var btnproses: Button
    private lateinit var Hasil: TextView
    var tb: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Nama = findViewById(R.id.nama)
        TB = findViewById(R.id.TB)
        rPR = findViewById(R.id.rPR)
        rLK = findViewById(R.id.rLK)
        btnproses = findViewById(R.id.btnproses)
        Hasil = findViewById(R.id.Hasil)

        btnproses.setOnClickListener {

            var tinggi = TB.text.toString().toInt()

            if (rLK.isChecked) {
                tb = (tinggi - 100) - ((tinggi - 100) * 10 / 100)
                Hasil.setText(tb.toString() + "kg")
            } else {
                tb = (tinggi - 100) - ((tinggi - 100) * 15 / 100)
                Hasil.setText(tb.toString() + "kg")
            }

        }
    }
}