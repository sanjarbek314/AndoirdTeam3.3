package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM2N19MisolBinding
import com.example.andoirdteam33.databinding.ActivityM2N20MisolBinding

class M2N20MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM2N20MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM2N20MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a=binding.A.text.toString()
            if (a.isNotEmpty()){
                binding.misol.text="${a.toInt()/3600}"
            }

        }
    }
}