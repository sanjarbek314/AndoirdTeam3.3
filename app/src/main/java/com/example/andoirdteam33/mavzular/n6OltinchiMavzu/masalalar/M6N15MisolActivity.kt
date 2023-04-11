package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N15MisolBinding

class M6N15MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N15MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N15MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}