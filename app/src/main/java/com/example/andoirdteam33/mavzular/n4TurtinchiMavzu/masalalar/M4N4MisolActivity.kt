package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N4MisolBinding

class M4N4MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N4MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N4MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            var b = binding.B.text.toString()
            var c = binding.C.text.toString()
            var s=0
            if (a.toInt()>0){
                s++
            }
            if (b.toInt()>0){
                s++
            }
            if (c.toInt()>0){
                s++
            }
            println("$s ta musbat son bor ")
        }

    }
}