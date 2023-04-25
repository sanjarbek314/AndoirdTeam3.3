package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N6MisolBinding
import com.example.andoirdteam33.databinding.ActivityM3N7MisolBinding

class M3N7MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N7MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N7MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener{
            var a = binding.A.text.toString()
            var b = binding.B.text.toString()
            var c = binding.C.text.toString()
            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty()){
                binding.misol.text=
            }
        }
    }
}