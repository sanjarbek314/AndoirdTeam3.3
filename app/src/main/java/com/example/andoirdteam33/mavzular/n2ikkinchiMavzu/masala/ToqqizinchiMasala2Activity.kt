package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityToqqizinchiMasala2Binding

class ToqqizinchiMasala2Activity : AppCompatActivity() {
    lateinit var binding: ActivityToqqizinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToqqizinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString().toInt()
            if (a.toString().isNotEmpty()&& a.toString().length==3) {
                binding.misol.text = "yuzlar xonasi=${a / 100}"

            }else{
                Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
            }


        }


    }
}