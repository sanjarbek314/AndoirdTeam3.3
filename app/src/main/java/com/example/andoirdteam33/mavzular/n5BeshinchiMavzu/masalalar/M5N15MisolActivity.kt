package com.example.andoirdteam33.mavzular.n5BeshinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM5N15MisolBinding

class M5N15MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM5N15MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM5N15MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}