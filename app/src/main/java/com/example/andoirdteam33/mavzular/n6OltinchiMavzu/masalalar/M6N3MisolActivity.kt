package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N3MisolBinding

class M6N3MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N3MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N3MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}