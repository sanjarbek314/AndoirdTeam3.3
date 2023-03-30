package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.databinding.ActivityOnUchinchiMasala1Binding

class OnUchinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOnUchinchiMasala1Binding
    var pi=3.14
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnUchinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.a.text.toString().isNotEmpty()&&binding.b.text.toString().isNotEmpty()){
                if (binding.a.text.toString()>binding.b.text.toString()){
                    binding.misol.text="S1=${pi*binding.a.text.toString().toInt()}\nS2=${pi*binding.b.text.toString().toInt()}\nS3=${pi*(binding.a.text.toString().toInt()-binding.b.text.toString().toInt())}"
                }else{
                    Toast.makeText(this, "R1 R2 dan katta bolsin!!", Toast.LENGTH_LONG).show()
                finish() }
            }else{
                Toast.makeText(this, "raqam kirit!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}