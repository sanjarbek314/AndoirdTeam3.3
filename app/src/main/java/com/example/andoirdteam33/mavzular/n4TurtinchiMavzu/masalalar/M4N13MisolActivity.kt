package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N12MisolBinding
import com.example.andoirdteam33.databinding.ActivityM4N13MisolBinding

class M4N13MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM4N13MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N13MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}