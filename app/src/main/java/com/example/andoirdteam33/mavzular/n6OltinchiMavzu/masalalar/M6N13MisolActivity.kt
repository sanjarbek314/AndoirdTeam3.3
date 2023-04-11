package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N13MisolBinding

class M6N13MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N13MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N13MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}