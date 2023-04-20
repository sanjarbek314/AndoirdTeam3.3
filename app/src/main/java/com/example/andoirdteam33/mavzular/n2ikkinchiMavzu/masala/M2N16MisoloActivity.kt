package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityM2N16MisoloBinding

class M2N16MisoloActivity : AppCompatActivity() {
    lateinit var binding: ActivityM2N16MisoloBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityM2N16MisoloBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            if (a.isNotEmpty() && a.length == 3) {
                binding.misol.text = "${a.toInt() / 100}${a.toInt() % 10}${a.toInt() / 10 % 10}"
            }
        }
    }
}