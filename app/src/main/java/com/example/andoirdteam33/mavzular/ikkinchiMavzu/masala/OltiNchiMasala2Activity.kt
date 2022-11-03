package com.example.andoirdteam33.mavzular.ikkinchiMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.R
import com.example.andoirdteam33.databinding.ActivityOltiNchiMasala2Binding

class OltiNchiMasala2Activity : AppCompatActivity() {
    lateinit var binding: ActivityOltiNchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOltiNchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            var a=binding.A.text.toString()
            if (a.isNotEmpty()){
                binding.misol.text="o'nliklar xonasi=${a.toInt()/10}\nbirliklar xonasi=${a.toInt()%10}"

            }else{
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }


        }
















    }
}