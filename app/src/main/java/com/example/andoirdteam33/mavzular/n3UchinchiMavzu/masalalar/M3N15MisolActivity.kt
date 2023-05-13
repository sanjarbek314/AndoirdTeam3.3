package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N15MisolBinding

class M3N15MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N15MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityM3N15MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.toString()
            var b = binding.B.toString()
            var c = binding.C.toString()
            var s =
                (a.toInt() > 0 && b.toInt() > 0 && c.toInt() > 0) || (a.toInt() > 0 && b.toInt() < 0 && c.toInt() > 0) || (a.toInt() > 0 && b.toInt() > 0 && c.toInt() < 0)
            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty()) {

                binding.misol.text = "$s"
            }

        }
    }
}