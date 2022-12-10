package com.example.andoirdteam33

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivitySvetaforNewAppBinding

class Svetafor_new_app_activity : AppCompatActivity() {
    lateinit var binding: ActivitySvetaforNewAppBinding
    var s = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySvetaforNewAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            when (s) {
                0 -> {
                    binding.red.setImageResource(R.drawable.svetafor_bg)
                    binding.yellow.setImageResource(R.drawable.svetafor_bg1)
                    binding.green.setImageResource(R.drawable.svetafor_bg3)
                    s = 1

                }
                1 -> {
                    binding.red.setImageResource(R.drawable.svetafor_bg3)
                    binding.yellow.setImageResource(R.drawable.svetafor_bg3)
                    binding.green.setImageResource(R.drawable.svetafor_bg2)
                    s = 2

                }
                2 -> {
                    binding.red.setImageResource(R.drawable.svetafor_bg)
                    binding.yellow.setImageResource(R.drawable.svetafor_bg3)
                    binding.green.setImageResource(R.drawable.svetafor_bg3)
                    s = 0

                }

            }


        }


    }
}