package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.databinding.ActivityTortinchiMasala1Binding

class TortinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityTortinchiMasala1Binding
    var pi = 3.14
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTortinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            if (binding.editText.text.toString().isNotEmpty()){
                binding.misol.text = "L=${pi * binding.editText.text.toString().toInt()}"
        }else{
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
        }





        }

    }
}