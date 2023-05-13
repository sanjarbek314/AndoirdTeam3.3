package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N1MisolBinding

class M4N1MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM4N1MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityM4N1MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            var s = if (a.toInt() > 0) {
                a + 1
            } else {
                a
            }
            if (a.isNotEmpty()) {
                binding.misol.text = "$s"
            }

        }
    }
}