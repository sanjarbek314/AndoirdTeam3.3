package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N1MisolBinding

class M3N1MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N1MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N1MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}