package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N11MisolBinding

class M6N11MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N11MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N11MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}