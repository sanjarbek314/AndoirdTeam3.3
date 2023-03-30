package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityYigirmanchiMasala1Binding

class YigirmanchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityYigirmanchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYigirmanchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var x1 = binding.x1.text.toString().toInt()
            var x2 = binding.x2.text.toString().toInt()
            var y1 = binding.y1.text.toString().toInt()
            var y2 = binding.y2.text.toString().toInt()

         if (x1.toString().isNotEmpty()&&x2.toString().isNotEmpty()&&y1.toString().isNotEmpty()&&y2.toString().isNotEmpty()){
             binding.misol.text="masofasi=${Math.sqrt(((x2.toString().toDouble()-x1.toString().toDouble())*(x2.toString().toDouble()-x1.toString().toDouble()))+((y2.toString().toDouble()-y1.toString().toDouble())*(y2.toString().toDouble()-y1.toString().toDouble())))}"
         }





        }

    }
}