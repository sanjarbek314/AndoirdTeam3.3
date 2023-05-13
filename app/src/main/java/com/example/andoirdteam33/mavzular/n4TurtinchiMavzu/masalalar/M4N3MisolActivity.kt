package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N3MisolBinding

class M4N3MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N3MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N3MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            var s = if (a.toInt() == 0) {
               var a=10
            } else {
                if (a.toInt()>0){
                    a+1
                }else{
                    a.toInt()-2
                }
            }
            if (a.isNotEmpty()) {
                binding.misol.text = "$s"
            }

        }
    }
}