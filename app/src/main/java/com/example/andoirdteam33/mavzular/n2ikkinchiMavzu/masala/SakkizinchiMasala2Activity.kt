package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivitySakkizinchiMasala2Binding

class SakkizinchiMasala2Activity : AppCompatActivity() {
    lateinit var binding: ActivitySakkizinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySakkizinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString().toInt()
            if (a.toString().isNotEmpty()) {
                binding.misol.text = "${a.toString().reversed()}"
            }

        }


    }
}