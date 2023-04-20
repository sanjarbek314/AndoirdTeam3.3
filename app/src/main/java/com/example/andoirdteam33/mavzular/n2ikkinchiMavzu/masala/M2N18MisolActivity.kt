package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM2N17MisolBinding
import com.example.andoirdteam33.databinding.ActivityM2N18MisolBinding

class M2N18MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM2N18MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM2N18MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a=binding.A.text.toString()
            if (a.isNotEmpty()&&a.length==4){
                binding.misol.text="${a.toInt()/1000%10}"
            }
        }
    }
}