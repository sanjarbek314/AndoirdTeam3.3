package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N16MisolBinding

class M4N16MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N16MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N16MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}