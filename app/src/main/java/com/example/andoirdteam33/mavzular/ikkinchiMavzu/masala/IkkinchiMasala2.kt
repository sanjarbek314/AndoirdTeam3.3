package com.example.androidteam32.mavzular.ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andoirdteam33.R
import com.example.andoirdteam33.databinding.ActivityIkkinchiMasala2Binding
import com.example.andoirdteam33.databinding.ActivityYigirmanchiMasala1Binding

class IkkinchiMasala2 : AppCompatActivity() {
    lateinit var binding: ActivityIkkinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIkkinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var M = binding.M.text.toString().toInt()
            if (M.toString().isNotEmpty()) {
                if (1 == 1000) {
                    binding.misol.text = "${M.toString().toInt()}"
                }


            } else {
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }


        }
    }


}
