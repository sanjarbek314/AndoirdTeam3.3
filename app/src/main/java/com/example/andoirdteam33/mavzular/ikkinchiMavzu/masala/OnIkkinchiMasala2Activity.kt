package com.example.andoirdteam33.mavzular.ikkinchiMavzu.masala

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityOnIkkinchiMasala2Binding

class OnIkkinchiMasala2Activity : AppCompatActivity() {
    lateinit var binding: ActivityOnIkkinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnIkkinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            if (a.isNotEmpty() && a.length == 3) {
                binding.misol.text = "${a.reversed()}"
            }
        }


    }
}