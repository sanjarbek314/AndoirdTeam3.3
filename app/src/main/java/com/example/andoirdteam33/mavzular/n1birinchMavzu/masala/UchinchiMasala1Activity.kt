package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityUchinchiMasala1Binding

class UchinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityUchinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUchinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            if(binding.editText.text.toString().isNotEmpty()&&binding.editText1.text.toString().isNotEmpty()){
            binding.misol.text = "s=${binding.editText.text.toString().toInt() * binding.editText1.text.toString().toInt()}\nP=${2 * (binding.editText.text.toString().toInt() + binding.editText1.text.toString().toInt())}"

           }else{
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
           }




        }
    }
}