package com.example.andoirdteam33.mavzular.n5BeshinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM5N4MisolBinding

class M5N4MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM5N4MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM5N4MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}