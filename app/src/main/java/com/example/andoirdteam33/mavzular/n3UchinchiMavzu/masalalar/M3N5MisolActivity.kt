package com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.databinding.ActivityM3N4MisolBinding
import com.example.andoirdteam33.databinding.ActivityM3N5MisolBinding

class M3N5MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM3N5MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM3N5MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            var b = binding.B.text.toString()
            if (a.isNotEmpty()&&b.isNotEmpty()){
                binding.misol.text="${a.toInt()>=0||b.toInt()<-2}"
            }else{
                Toast.makeText(this, "raqam kiriting✍️✍️!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}