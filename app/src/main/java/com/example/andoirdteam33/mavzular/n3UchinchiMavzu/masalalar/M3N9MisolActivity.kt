package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N9MisolBinding

class M3N9MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM3N9MisolBinding
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                binding= ActivityM3N9MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}