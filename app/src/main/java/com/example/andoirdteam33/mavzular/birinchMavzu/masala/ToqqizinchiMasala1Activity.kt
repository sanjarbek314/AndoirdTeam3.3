package com.example.andoirdteam33.mavzular.birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.R
import com.example.andoirdteam33.databinding.ActivitySakkizinchiMasala1Binding
import com.example.andoirdteam33.databinding.ActivityToqqizinchiMasala1Binding
import kotlin.math.sqrt

class ToqqizinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityToqqizinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityToqqizinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.chiziq.text.toString().isNotEmpty()&&binding.chiziq1.text.toString().isNotEmpty()){
                binding.misol.text="o'rta geometrigi=${Math(sqrt(binding.chiziq.text.toString().toDouble()*binding.chiziq1.text.toString().toDouble()))}"
            }else{
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}