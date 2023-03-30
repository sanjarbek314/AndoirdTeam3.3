package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.databinding.ActivityYettinchiMasala1Binding

class YettinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityYettinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYettinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.chiziq.text.toString().isNotEmpty() && binding.chiziq1.text.toString()
                    .isNotEmpty()
            ) {
                binding.misol.text = "L=${
                    2 * binding.chiziq1.text.toString().toInt() * binding.chiziq.text.toString()
                        .toInt()
                }\nS=${
                    binding.chiziq1.text.toString().toInt() * binding.chiziq.text.toString()
                        .toInt() * binding.chiziq.text.toString().toInt()
                }"
            } else {
                Toast.makeText(this, "raqam kiritin", Toast.LENGTH_SHORT).show()
            }
        }
    }
}