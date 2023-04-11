package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N7MisolBinding

class M4N7MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N7MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N7MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}