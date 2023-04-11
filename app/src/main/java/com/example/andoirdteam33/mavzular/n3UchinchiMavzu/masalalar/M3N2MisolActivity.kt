package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N1MisolBinding
import com.example.andoirdteam33.databinding.ActivityM3N2MisolBinding

class M3N2MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N2MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N2MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}