package com.example.andoirdteam33

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityMainBinding
import com.example.androidteam32.mavzular.birinchMavzu.BirinchMavzuActivity
import com.example.androidteam32.mavzular.ikkinchiMavzu.IkkinchiMavzuActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, BirinchMavzuActivity::class.java))
        }
        binding.btn2.setOnClickListener {
            startActivity(Intent(this, IkkinchiMavzuActivity::class.java))
        }
        binding.btn3.setOnClickListener {
            startActivity(Intent(this, IkkinchiMavzuActivity::class.java))
        }
        binding.btn4.setOnClickListener {
            startActivity(Intent(this, IkkinchiMavzuActivity::class.java))
        }
        binding.btn5.setOnClickListener {
            startActivity(Intent(this, IkkinchiMavzuActivity::class.java))
        }
        binding.btn6.setOnClickListener {
            startActivity(Intent(this, IkkinchiMavzuActivity::class.java))
        }


    }
}