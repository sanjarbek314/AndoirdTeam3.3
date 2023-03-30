package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityOnYettinchiMasala1Binding

class OnYettinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOnYettinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnYettinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString().toInt()
            var b = binding.B.text.toString().toInt()
            var c = binding.C.text.toString().toInt()
            if (a.toString().isNotEmpty() && b.toString().isNotEmpty() && c.toString().isNotEmpty()) {
                binding.misol.text = "${Math.abs((a - b) + (b - c))}"
            } else {
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }


        }
    }
}