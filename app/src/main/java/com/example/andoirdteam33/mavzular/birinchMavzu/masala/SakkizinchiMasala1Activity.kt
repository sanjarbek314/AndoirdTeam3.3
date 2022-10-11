package com.example.andoirdteam33.mavzular.birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.R
import com.example.andoirdteam33.databinding.ActivitySakkizinchiMasala1Binding

class SakkizinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivitySakkizinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySakkizinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.chiziq.text.toString().isNotEmpty() && binding.chiziq1.text.toString().isNotEmpty()) {
                binding.misol.text = "o'rta arifmetigi=${(binding.chiziq.text.toString().toInt()+binding.chiziq1.text.toString().toInt())/2}"
            } else {
                Toast.makeText(this, "raqam kiritin", Toast.LENGTH_SHORT).show()
            }

        }
    }
}