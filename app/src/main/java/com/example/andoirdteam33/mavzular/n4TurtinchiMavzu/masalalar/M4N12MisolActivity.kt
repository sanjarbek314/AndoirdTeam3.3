package com.example.andoirdteam33.mavzular.n4TurtinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM4N12MisolBinding

class M4N12MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM4N12MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM4N12MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
        var a=binding.A.text.toString()
        var b=binding.B.text.toString()
        var c=binding.C.text.toString()
        if (a>b){
           if (b>c){
               println("kichigi $c")
           }else{
               println("kichigi $b")
           }
        }else{
            if (a>c){
                println("kichigi $c")
            }else{
                println("kichigi $a")
            }
        }





        }
    }
}