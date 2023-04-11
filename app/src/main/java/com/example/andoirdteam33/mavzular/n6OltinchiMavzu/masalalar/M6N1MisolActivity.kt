package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N1MisolBinding

class M6N1MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N1MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N1MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}