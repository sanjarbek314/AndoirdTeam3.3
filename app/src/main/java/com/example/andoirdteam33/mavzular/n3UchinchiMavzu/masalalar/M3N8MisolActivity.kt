package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityM3N8MisolBinding

class M3N8MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N8MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityM3N8MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            var b = binding.B.text.toString()
            if (a.isNotEmpty() && b.isNotEmpty()) {
                binding.misol.text = "${a.toInt() % 2 == 1 && b.toInt() % 2 == 1}"
            }
        }
    }
}