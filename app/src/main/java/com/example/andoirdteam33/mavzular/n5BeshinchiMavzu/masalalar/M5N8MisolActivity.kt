package com.example.andoirdteam33.mavzular.n5BeshinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM5N8MisolBinding

class M5N8MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM5N8MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM5N8MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}