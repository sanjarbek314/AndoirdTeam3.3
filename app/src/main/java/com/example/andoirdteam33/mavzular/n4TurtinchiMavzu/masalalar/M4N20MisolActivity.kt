package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N20MisolBinding

class M4N20MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N20MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N20MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}