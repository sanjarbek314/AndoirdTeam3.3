package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N11MisolBinding

class M4N11MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N11MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N11MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}