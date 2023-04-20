package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N6MisolBinding
import com.example.andoirdteam33.databinding.ActivityM3N8MisolBinding

class M3N8MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N8MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N8MisolBinding.inflate(layoutInflater)
        setContentView(binding.roo)
    }
}