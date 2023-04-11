package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N4MisolBinding

class M6N4MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N4MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N4MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}