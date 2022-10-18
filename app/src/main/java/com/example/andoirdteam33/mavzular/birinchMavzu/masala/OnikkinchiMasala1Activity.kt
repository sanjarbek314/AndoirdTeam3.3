package com.example.andoirdteam33.mavzular.birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.R
import com.example.andoirdteam33.databinding.ActivityOnikkinchiMasala1Binding

class OnikkinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding:ActivityOnikkinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnikkinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.a.text.toString().isNotEmpty()&&binding.b.text.toString().isNotEmpty()){
                binding.misol.text="C=${Math.sqrt(binding.a.text.toString().toDouble()*binding.a.text.toString().toDouble()+binding.b.text.toString().toDouble()*binding.b.text.toString().toDouble())
                }\nP=${binding.a.text.toString().toInt()+binding.b.text.toString().toInt()+(Math.sqrt(binding.a.text.toString().toDouble()*binding.a.text.toString().toDouble()+binding.b.text.toString().toDouble()*binding.b.text.toString().toDouble()))}"
            }
        }
    }
}