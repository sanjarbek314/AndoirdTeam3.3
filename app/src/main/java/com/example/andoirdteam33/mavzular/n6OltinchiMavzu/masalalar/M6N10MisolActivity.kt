package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N10MisolBinding

class M6N10MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N10MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N10MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}