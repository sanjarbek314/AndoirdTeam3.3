package com.example.androidteam32.mavzular.ikkinchiMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityIkkinchiMasala2Binding

class IkkinchiMasala2 : AppCompatActivity() {
    lateinit var binding: ActivityIkkinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIkkinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var M = binding.M.text.toString().toDouble()
            if (M.toString().isNotEmpty()) {
                binding.misol.text = "${M / 1000}"
            } else {
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
