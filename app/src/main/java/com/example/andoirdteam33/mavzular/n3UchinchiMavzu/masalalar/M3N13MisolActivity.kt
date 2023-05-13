package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N12MisolBinding
import com.example.andoirdteam33.databinding.ActivityM3N13MisolBinding

class M3N13MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N13MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityM3N13MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            var b = binding.B.text.toString()
            var c = binding.C.text.toString()
            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty()) {
                binding.misol.text =
                    "${a.toInt() > 0 || b.toInt() > 0 || c.toInt() > 0}||${a.toInt() > 0 || b.toInt() < 0 || c.toInt() < 0}${a.toInt() < 0 || b.toInt() > 0 || c.toInt() < 0}${a.toInt() < 0 || b.toInt() < 0 || c.toInt() > 0}"
            }
        }
    }
}