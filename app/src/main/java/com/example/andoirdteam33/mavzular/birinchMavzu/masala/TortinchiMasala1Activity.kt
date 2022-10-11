package com.example.andoirdteam33.mavzular.birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityTortinchiMasala1Binding

class TortinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityTortinchiMasala1Binding
    var pi = 3.14
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTortinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            binding.misol.text = "L=${pi * binding.editText.text.toString().toInt()}"
        }

    }
}