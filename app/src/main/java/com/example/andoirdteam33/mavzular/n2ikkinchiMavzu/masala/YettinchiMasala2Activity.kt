package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityYettinchiMasala2Binding

class YettinchiMasala2Activity : AppCompatActivity() {
    lateinit var binding: ActivityYettinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYettinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            if (a.isNotEmpty()) {
                binding.misol.text = "raqamlar yig'indissi=${(a.toInt() / 10) + (a.toInt() % 10)}"
            } else {
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }


        }


    }
}