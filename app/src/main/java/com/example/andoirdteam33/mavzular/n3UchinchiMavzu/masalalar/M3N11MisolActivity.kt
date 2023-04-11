package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N11MisolBinding

class M3N11MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM3N11MisolBinding
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                binding= ActivityM3N11MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}