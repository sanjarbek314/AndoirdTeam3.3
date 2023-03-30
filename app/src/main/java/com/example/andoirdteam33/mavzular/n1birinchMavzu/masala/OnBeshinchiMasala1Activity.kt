package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityOnBeshinchiMasala1Binding

class OnBeshinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOnBeshinchiMasala1Binding
    var pi=3.14
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnBeshinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.s.text.toString().isNotEmpty()){
                binding.misol.text="R=${Math.sqrt(binding.s.text.toString().toDouble()/pi)}\nL=${2*pi*(Math.sqrt(binding.s.text.toString().toDouble()/pi))}"
            }
        }










    }
}