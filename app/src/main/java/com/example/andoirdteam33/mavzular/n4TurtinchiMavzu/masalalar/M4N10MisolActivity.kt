package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N10MisolBinding

class M4N10MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N10MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N10MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}