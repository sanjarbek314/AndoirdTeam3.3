package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N6MisolBinding

class M6N6MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N6MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N6MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}