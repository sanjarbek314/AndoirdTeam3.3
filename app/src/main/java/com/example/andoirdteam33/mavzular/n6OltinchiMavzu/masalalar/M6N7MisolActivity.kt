package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N7MisolBinding

class M6N7MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N7MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N7MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}