package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM3N17MisolBinding

class M3N17MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N17MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N17MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a=binding.A.toString()
            if (a.isNotEmpty()&&a.length==3){
                binding.misol.text="${a.toInt()%2==1}"
            }
        }
    }
}