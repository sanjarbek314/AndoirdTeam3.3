package com.example.andoirdteam33.mavzular.n1birinchMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityOltinchiMasala1Binding

class OltinchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOltinchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOltinchiMasala1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
                  if (binding.a.text.toString().isNotEmpty() && binding.b.text.toString().isNotEmpty() && binding.c.text.toString().isNotEmpty()){
                    binding.misol.text="V=${binding.a.text.toString().toInt()*binding.b.text.toString().toInt()*binding.c.text.toString().toInt()
                  }\nS=${2*(binding.a.text.toString().toInt()*binding.b.text.toString().toInt()+binding.b.text.toString().toInt()*binding.c.text.toString().toInt()+binding.a.text.toString().toInt()*binding.c.text.toString().toInt())}"
        }else{
                      Toast.makeText(this, "raqam kiriting!!", Toast.LENGTH_SHORT).show()
        }


    }
}
}