package com.example.andoirdteam33.mavzular.birinchMavzu.masala

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityUchinchiMasala1Binding

class UchinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityUchinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUchinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            binding.misol.text = "s=${binding.editText.text.toString().toInt() * binding.editText1.text.toString().toInt()}\nP=${2 * (binding.editText.text.toString().toInt() + binding.editText1.text.toString().toInt())}"
        }
    }
}