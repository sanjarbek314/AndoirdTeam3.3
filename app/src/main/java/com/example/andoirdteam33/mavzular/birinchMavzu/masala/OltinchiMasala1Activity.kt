package com.example.andoirdteam33.mavzular.birinchMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityOltinchiMasala1Binding

class OltinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOltinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOltinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.chiziq.text.toString().isNotEmpty() && binding.chiziq1.text.toString()
                    .isNotEmpty() && binding.chiziq2.text.toString().isNotEmpty()
            ) {
                binding.misol.text = "V=${
                    binding.chiziq.text.toString().toInt() * binding.chiziq1.text.toString()
                        .toInt() * binding.chiziq2.text.toString().toInt()
                }\nS=${
                    2 * (binding.chiziq.text.toString().toInt() * binding.chiziq1.text.toString()
                        .toInt() + binding.chiziq1.text.toString()
                        .toInt() * binding.chiziq2.text.toString()
                        .toInt() + binding.chiziq.text.toString()
                        .toInt() * binding.chiziq2.text.toString().toInt())
                }"
            } else {
                Toast.makeText(this, "raqam kiriting", Toast.LENGTH_SHORT).show()
            }

        }
    }
}