package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N11MisolBinding

class M4N11MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N11MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N11MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a=binding.A.text.toString()
            var b=binding.B.text.toString()
            if (a==b){
                var a=0
                var b=0
            }else{
                if (a>b){
                    var a=a
                    var b=a
                }else{
                    var a=b
                    var b=b
                }
            }
            println("$a")
            println("$b")
        }
    }
}