package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N5MisolBinding

class M4N5MisolActivity : AppCompatActivity() {
    lateinit var binding: ActivityM4N5MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityM4N5MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            var b = binding.B.text.toString()
            var c = binding.C.text.toString()
            var s = 0
            var n = 0
            if (a.toInt() > 0) {
                s++
            }else{
                n++
            }
            if (b.toInt() > 0) {
                s++
            }else{
                n++
            }
            if (c.toInt() > 0) {
                s++
            }else{
                n++
            }
            println("$s ta musbat son bor ")
            println("$n ta manfiy son bor ")
        }
    }
}