package com.example.androidteam32.mavzular.birinchMavzu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityBirinchMavzuBinding
import com.example.andoirdteam33.mavzular.n1birinchMavzu.masala.*
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
        binding.btn7.setOnClickListener {
            startActivity(Intent(this, YettinchiMasala1Activity::class.java))
        }
        binding.btn8.setOnClickListener {
            startActivity(Intent(this, SakkizinchiMasala1Activity::class.java))
        }
        binding.btn9.setOnClickListener {
            startActivity(Intent(this, ToqqizinchiMasala1Activity::class.java))
        }
        binding.btn10.setOnClickListener {
            startActivity(Intent(this, OningchiMasala1Activity::class.java))
        }
        binding.btn11.setOnClickListener {
            startActivity(Intent(this, OnbirinchiMasala1Activity::class.java))
        }
        binding.btn12.setOnClickListener {
            startActivity(Intent(this, OnikkinchiMasala1Activity::class.java))
        }
        binding.btn13.setOnClickListener {
            startActivity(Intent(this, OnUchinchiMasala1Activity::class.java))
        }
        binding.btn14.setOnClickListener {
            startActivity(Intent(this, OnTortinchiMasala1Activity::class.java))
        }
        binding.btn15.setOnClickListener {
            startActivity(Intent(this, OnBeshinchiMasala1Activity::class.java))
        }
        binding.btn16.setOnClickListener {
            startActivity(Intent(this, OnOltinchiMasala1Activity::class.java))
        }
        binding.btn17.setOnClickListener {
            startActivity(Intent(this, OnYettinchiMasala1Activity::class.java))
        }
        binding.btn18.setOnClickListener {
            startActivity(Intent(this, OnSakkizinchiMasala1Activity::class.java))
        }
        binding.btn20.setOnClickListener {
            startActivity(Intent(this, YigirmanchiMasala1Activity::class.java))
        }
    }
}