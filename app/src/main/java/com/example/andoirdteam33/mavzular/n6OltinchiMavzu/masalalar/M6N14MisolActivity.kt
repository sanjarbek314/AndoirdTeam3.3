package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N14MisolBinding

class M6N14MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N14MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N14MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}