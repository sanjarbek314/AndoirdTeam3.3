package com.example.andoirdteam33.mavzular.ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.R
import com.example.andoirdteam33.databinding.ActivityTorTinchiMasala2Binding

class TorTinchiMasala2Activity : AppCompatActivity() {
    lateinit var binding: ActivityTorTinchiMasala2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTorTinchiMasala2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var a = binding.A.text.toString().toInt()
            var b = binding.B.text.toString().toInt()
            if (a.toString().isNotEmpty()&&b.toString().isNotEmpty()){
                if (a>0&&b>0){
                    if (a>b){
                        binding.misol.text="${a/b}marta joyash tirish mumking"
                    }
                }
            }

        }


    }
}