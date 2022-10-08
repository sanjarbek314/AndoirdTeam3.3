package com.example.andoirdteam33

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityMainBinding
import com.example.androidteam32.mavzular.birinchMavzu.BirinchMavzuActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, BirinchMavzuActivity::class.java))
        }


    }
}