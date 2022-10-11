package com.example.androidteam32.mavzular.birinchMavzu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityBirinchMavzuBinding
import com.example.andoirdteam33.mavzular.birinchMavzu.masala.BeshinchiMasala1Activity
import com.example.andoirdteam33.mavzular.birinchMavzu.masala.OltinchiMasala1Activity
import com.example.andoirdteam33.mavzular.birinchMavzu.masala.TortinchiMasala1Activity
import com.example.andoirdteam33.mavzular.birinchMavzu.masala.UchinchiMasala1Activity
import com.example.androidteam32.mavzular.birinchMavzu.masala.BirinchiMasala1Activity
import com.example.androidteam32.mavzular.birinchMavzu.masala.IkkinchiMasala1Activitiy

class BirinchMavzuActivity : AppCompatActivity() {
    lateinit var binding: ActivityBirinchMavzuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirinchMavzuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, BirinchiMasala1Activity::class.java))
        }
        binding.btn2.setOnClickListener {
            startActivity(Intent(this, IkkinchiMasala1Activitiy::class.java))
        }
        binding.btn3.setOnClickListener {
            startActivity(Intent(this, UchinchiMasala1Activity::class.java))
        }
        binding.btn4.setOnClickListener {
            startActivity(Intent(this, TortinchiMasala1Activity::class.java))
        }
        binding.btn5.setOnClickListener {
            startActivity(Intent(this, BeshinchiMasala1Activity::class.java))
        }
        binding.btn6.setOnClickListener {
            startActivity(Intent(this, OltinchiMasala1Activity::class.java))
        }

    }
}