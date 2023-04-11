package com.example.andoirdteam33.mavzular.n5BeshinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM5N9MisolBinding

class M5N9MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM5N9MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM5N9MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}