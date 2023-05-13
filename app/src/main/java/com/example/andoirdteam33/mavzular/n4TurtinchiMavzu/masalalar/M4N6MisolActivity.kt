package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N6MisolBinding

class M4N6MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N6MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N6MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}