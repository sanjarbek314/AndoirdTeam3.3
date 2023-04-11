package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N6MisolBinding
import com.example.andoirdteam33.databinding.ActivityM3N7MisolBinding

class M3N7MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N7MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N7MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}