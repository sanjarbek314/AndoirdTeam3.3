package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityM2N14MisolBinding

class M2N14MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM2N14MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityM2N14MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            if (a.isNotEmpty() && a.length == 3){
                binding.misol.text="${a.toInt()%10}${a.toInt()/100}"
            }else{
                Toast.makeText(this, "raqam kiritin!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}