package com.example.andoirdteam33.mavzular.birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityOnBeshinchiMasala1Binding
import com.example.andoirdteam33.databinding.ActivityOnikkinchiMasala1Binding

class OnBeshinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOnBeshinchiMasala1Binding
    var pi=3.14
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnBeshinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.s.text.toString().isNotEmpty()){
                binding.misol.text="R=${binding.s.text.toString().toInt()/(2*pi)}\nL=${2*pi*(binding.s.text.toString().toInt()/(2*pi))}"
            }
        }










    }
}