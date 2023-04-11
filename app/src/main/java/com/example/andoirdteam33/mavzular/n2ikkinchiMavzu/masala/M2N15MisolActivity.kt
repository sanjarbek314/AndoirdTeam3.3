package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM2N14MisolBinding
import com.example.andoirdteam33.databinding.ActivityM2N15MisolBinding

class M2N15MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM2N15MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM2N15MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a=binding.A.text.toString()
            if (a.isNotEmpty()&&a.length==3){
                binding.misol.text="${a.toInt()/10%10} ${a.toInt()/100} ${a.toInt()%10}"
            }
        }
    }
}