package com.example.andoirdteam33.mavzular.n5BeshinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM5N6MisolBinding

class M5N6MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM5N6MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM5N6MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}