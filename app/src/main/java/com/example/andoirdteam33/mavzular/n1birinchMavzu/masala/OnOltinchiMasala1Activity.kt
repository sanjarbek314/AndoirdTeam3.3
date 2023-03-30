package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityOnOltinchiMasala1Binding

class OnOltinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOnOltinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnOltinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var x1 = binding.x1.text.toString().toInt()
            var x2 = binding.x2.text.toString().toInt()
            if (x1.toString().isNotEmpty() && x2.toString().isNotEmpty()) {
                binding.misol.text = "${Math.abs(x2 - x1)}"
            } else {
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}