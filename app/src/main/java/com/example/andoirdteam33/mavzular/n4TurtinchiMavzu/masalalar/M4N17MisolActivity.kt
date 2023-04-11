package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N17MisolBinding

class M4N17MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N17MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N17MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}