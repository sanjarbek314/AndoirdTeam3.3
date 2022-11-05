package com.example.andoirdteam33.mavzular.ikkinchiMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityOninchiMasala2Binding

class OninchiMasala2Activity : AppCompatActivity() {
    lateinit var binding: ActivityOninchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOninchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString()
            if (a.isNotEmpty() && a.length == 3){
                binding.misol.text="birliklar xonasi=${a.toInt()%10}\no'nliklar xonasi=${a.toInt()/10}"
            }else{
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }


        }


    }
}