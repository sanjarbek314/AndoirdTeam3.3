package com.example.androidteam32.mavzular.birinchMavzu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityBirinchMavzuBinding
import com.example.androidteam32.mavzular.birinchMavzu.masala.BirinchiMasala1Activity

class BirinchMavzuActivity : AppCompatActivity() {
    lateinit var binding: ActivityBirinchMavzuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirinchMavzuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //sardor
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, BirinchiMasala1Activity::class.java))
        }
    }
}