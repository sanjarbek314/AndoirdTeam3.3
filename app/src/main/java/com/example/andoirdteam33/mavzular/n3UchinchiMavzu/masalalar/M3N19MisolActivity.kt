package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N19MisolBinding

class M3N19MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM3N19MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N19MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.toString()
            var b = binding.B.toString()
            var c = binding.C.toString()
            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty()) {
                binding.misol.text = "${a.toInt() == -b.toInt() || a.toInt() == -c.toInt() || b.toInt() == -c.toInt()}"
            }
        }
    }
}