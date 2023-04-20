package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityGameBinding
import com.example.andoirdteam33.databinding.ActivityM2N17MisolBinding

class M2N17MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM2N17MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM2N17MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a=binding.A.text.toString()
            if (a.isNotEmpty()&&a.length==3){
                binding.misol.text="${a.toInt()/100%10}"
            }
        }

    }
}