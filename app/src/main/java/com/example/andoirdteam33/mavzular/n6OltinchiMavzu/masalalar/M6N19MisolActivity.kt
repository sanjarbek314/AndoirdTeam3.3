package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N19MisolBinding

class M6N19MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N19MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N19MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}