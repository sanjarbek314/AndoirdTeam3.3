package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N3MisolBinding
import com.example.andoirdteam33.databinding.ActivityM3N4MisolBinding

class M3N4MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N4MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N4MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}