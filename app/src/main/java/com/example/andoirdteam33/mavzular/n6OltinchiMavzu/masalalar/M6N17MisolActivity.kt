package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N17MisolBinding

class M6N17MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N17MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N17MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}