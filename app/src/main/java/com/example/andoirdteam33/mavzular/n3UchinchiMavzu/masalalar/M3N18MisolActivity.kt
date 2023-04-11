package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N18MisolBinding

class M3N18MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM3N18MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N18MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}