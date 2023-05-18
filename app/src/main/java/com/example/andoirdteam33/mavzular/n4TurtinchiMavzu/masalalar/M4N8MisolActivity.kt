package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N8MisolBinding

class M4N8MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N8MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N8MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a=binding.A.text.toString()
            var b=binding.B.text.toString()
            if (a>b){
                println("$a kattasi , $b kichigi")
            }else{
                println("$b kattasi , $a kichigi")
            }

        }
    }
}