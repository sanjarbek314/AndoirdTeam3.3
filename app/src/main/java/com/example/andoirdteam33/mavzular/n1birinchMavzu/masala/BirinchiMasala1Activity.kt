package com.example.androidteam32.mavzular.birinchMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityBirinchiMasala1Binding

class BirinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityBirinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            if (binding.editText.text.toString().isNotEmpty()){
                binding.misol.text="P-${4*binding.editText.text.toString().toInt()}"
            }else{
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()}
          
        }




    }
}