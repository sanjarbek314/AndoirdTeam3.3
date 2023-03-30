package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.databinding.ActivityOnTortinchiMasala1Binding

class OnTortinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding:ActivityOnTortinchiMasala1Binding
    var pi=3.14
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnTortinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.a.text.toString().isNotEmpty() ){
                binding.misol.text="R=${binding.a.text.toString().toInt()/(2*pi)}\nS=${pi*(binding.a.text.toString().toInt()*binding.a.text.toString().toInt())}"
            }else{
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()}

        }








        }
}
