package com.example.androidteam32.mavzular.ikkinchiMavzu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityIkkinchiMavzuBinding
import com.example.androidteam32.mavzular.ikkinchiMavzu.masala.BinchiMasala2Activity

class IkkinchiMavzuActivity : AppCompatActivity() {
    lateinit var binding: ActivityIkkinchiMavzuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIkkinchiMavzuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, BinchiMasala2Activity::class.java))
        }


    }
}