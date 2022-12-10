package com.example.andoirdteam33.mavzular.ikkinchiMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityOnBirinchiMasala2Binding

class OnBirinchiMasala2Activity : AppCompatActivity() {
    lateinit var binding: ActivityOnBirinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBirinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {

            var a = binding.A.text.toString()
            if (a.isNotEmpty() && a.length == 3) {
                binding.misol.text =
                    "raqamlar yig'indisi=${(a.toInt() / 100) + (a.toInt() / 10) % 10 + (a.toInt() % 10)}"
            } else {
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }


        }


    }
}