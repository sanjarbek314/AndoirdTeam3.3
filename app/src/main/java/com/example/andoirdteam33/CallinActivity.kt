package com.example.andoirdteam33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityCallinBinding

class CallinActivity : AppCompatActivity() {
    lateinit var binding: ActivityCallinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCallinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.callof.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}