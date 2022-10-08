package com.example.androidteam32.mavzular.birinchMavzu.masala

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityIkkinchiMasala1ActivitiyBinding

class IkkinchiMasala1Activitiy : AppCompatActivity() {
    lateinit var binding: ActivityIkkinchiMasala1ActivitiyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIkkinchiMasala1ActivitiyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            binding.misol.text = "S=${binding.editText.text.toString().toInt() * binding.editText.text.toString().toInt()}"
        }
    }
}