package com.example.andoirdteam33.mavzular.n5BeshinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM5N11MisolBinding

class M5N11MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM5N11MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM5N11MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}