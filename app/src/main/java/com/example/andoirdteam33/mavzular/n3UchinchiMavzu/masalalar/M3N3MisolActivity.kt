package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityM3N3MisolBinding

class M3N3MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N3MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityM3N3MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            if (a.isNotEmpty()) {
                if (a.toInt() / 2 == 0) {
                    binding.misol.text = "A soni juft son"
                } else {
                    binding.misol.text = "A soni toq son"
                }
            }
        }
    }
}