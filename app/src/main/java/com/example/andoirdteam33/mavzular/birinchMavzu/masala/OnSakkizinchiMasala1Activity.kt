package com.example.andoirdteam33.mavzular.birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.R
import com.example.andoirdteam33.databinding.ActivityOnSakkizinchiMasala1Binding
import com.example.andoirdteam33.databinding.ActivityOnYettinchiMasala1Binding

class OnSakkizinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOnSakkizinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnSakkizinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString().toInt()
            var b = binding.B.text.toString().toInt()
            var c = binding.C.text.toString().toInt()
            if (a.toString().isNotEmpty() && b.toString().isNotEmpty() && c.toString().isNotEmpty()) {
                binding.misol.text = "${Math.abs((a - c) * (b - c))}"
            } else {
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }


        }
    }
}