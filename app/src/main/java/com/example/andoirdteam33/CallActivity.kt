package com.example.andoirdteam33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityCallBinding

class CallActivity : AppCompatActivity() {
    lateinit var binding:ActivityCallBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCallBinding.inflate(layoutInflater)
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
        binding.btn4.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "4"
        }
        binding.btn5.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "5"
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
        binding.delete.setOnClickListener {
            var a = binding.text.text.toString()
            var b = ""
            for (i in 0..a.length - 2) {
                b += a[i]
            }

            binding.text.text = b


        }
        binding.call1.setOnClickListener {
            startActivity(Intent(this, CallinActivity::class.java))
        }
        binding.yulduz.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "*"
        }
        binding.panjara.setOnClickListener {
            var a = binding.text.text.toString()
            binding.text.text = a + "#"
        }

    }
}