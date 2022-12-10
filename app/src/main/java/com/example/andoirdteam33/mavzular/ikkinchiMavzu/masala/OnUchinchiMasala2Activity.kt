package com.example.andoirdteam33.mavzular.ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.R
import com.example.andoirdteam33.databinding.ActivityOnUchinchiMasala2Binding

class OnUchinchiMasala2Activity : AppCompatActivity() {
    lateinit var binding:ActivityOnUchinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnUchinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a=binding.A.text.toString().toInt()

        }










    }
}