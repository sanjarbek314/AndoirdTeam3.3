package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM2N19MisolBinding
import com.example.andoirdteam33.databinding.ActivityN3UchinchiMavzuBinding

class M2N19MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM2N19MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM2N19MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a=binding.A.text.toString()
            if (a.isNotEmpty()){
                binding.misol.text="${a.toInt()/60}"
            }

        }
     }
}