package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM6N16MisolBinding

class M6N16MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N16MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N16MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}