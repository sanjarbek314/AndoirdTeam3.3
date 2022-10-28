package com.example.androidteam32.mavzular.ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.R
import com.example.andoirdteam33.databinding.ActivityBinchiMasala2Binding


class BinchiMasala2Activity : AppCompatActivity() {
    lateinit var binding: ActivityBinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var L = binding.L.text.toString().toInt()
            if (L.toString().isNotEmpty()) {
                if (100 == 1) {
                    binding.misol.text = "${L.toString().toInt()}"
                }


            } else {
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }


        }


    }
}