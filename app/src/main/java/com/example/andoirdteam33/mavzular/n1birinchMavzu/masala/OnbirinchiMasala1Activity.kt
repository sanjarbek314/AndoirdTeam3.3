package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.databinding.ActivityOnbirinchiMasala1Binding

class OnbirinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOnbirinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnbirinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.chiziq.text.toString().isNotEmpty() && binding.chiziq1.text.toString().isNotEmpty()) {
                if (0 < binding.chiziq.text.toString().toInt() && 0 < binding.chiziq1.text.toString().toInt()) {
                    if (0<binding.chiziq1.text.toString().toInt()){
                    binding.misol.text = "yig'indisi=${binding.chiziq.text.toString().toInt() + binding.chiziq1.text.toString().toInt()
                    }\nko'paytmasi=${binding.chiziq.text.toString().toInt() * binding.chiziq1.text.toString().toInt()
                    }\na-moduli=${Math.abs(binding.chiziq.text.toString().toInt())
                    }\nb-moduli=${Math.abs(binding.chiziq1.text.toString().toInt())}"}else{ Toast.makeText(this, "nol kiritma!!", Toast.LENGTH_LONG).show()
                        finish()}
                }else{
                    Toast.makeText(this, "nol kiritma!!", Toast.LENGTH_LONG).show()
                    finish()
                }
            } else {
                Toast.makeText(this, "raqam kiritin!!!", Toast.LENGTH_SHORT).show()
            }


        }
    }
}