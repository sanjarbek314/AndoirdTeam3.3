package com.example.andoirdteam33.mavzular

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityNewCalculatorBinding

class NewCalculator : AppCompatActivity() {
    lateinit var binding: ActivityNewCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "1"
        }
        binding.btn2.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "2"
        }
        binding.btn3.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "3"
        }
        binding.C.setOnClickListener {
            var a = binding.text.text.toString()
            var b = ""
            for (i in 0..a.length - 2) {
                b += a[i]
            }

            binding.text.text = b
        }
        binding.btn4.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "4"
        }
        binding.btn5.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "5"
        }
        binding.ac.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = "0"
        }
        binding.btn6.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "6"
        }
        binding.btn7.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "7"
        }
        binding.btn8.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "8"
        }
        binding.btn9.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "9"
        }
        binding.btn0.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "0"
        }
        binding.btnNuq.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "."
        }
        binding.qavs1.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "("
        }
        binding.qavs2.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + ")"
        }

    }
}