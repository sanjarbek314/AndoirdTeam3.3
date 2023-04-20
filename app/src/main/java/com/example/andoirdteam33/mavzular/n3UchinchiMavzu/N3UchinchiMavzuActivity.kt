package com.example.andoirdteam33.mavzular.n3UchinchiMavzu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityGameBinding
import com.example.andoirdteam33.databinding.ActivityN3UchinchiMavzuBinding
import com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala.*
import com.example.andoirdteam33.mavzular.n3UchinchiMavzu.masalalar.*
import com.example.androidteam32.mavzular.ikkinchiMavzu.masala.BinchiMasala2Activity
import com.example.androidteam32.mavzular.ikkinchiMavzu.masala.IkkinchiMasala2

class N3UchinchiMavzuActivity : AppCompatActivity() {
    lateinit var binding: ActivityN3UchinchiMavzuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityN3UchinchiMavzuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            startActivity(Intent(this, M3N1MisolActivity::class.java))
        }
        binding.btn2.setOnClickListener {
            startActivity(Intent(this, M3N2MisolActivity::class.java))
        }
        binding.btn3.setOnClickListener {
            startActivity(Intent(this, M3N3MisolActivity::class.java))
        }
        binding.btn4.setOnClickListener {
            startActivity(Intent(this, M3N4MisolActivity::class.java))
        }
        binding.btn5.setOnClickListener {
            startActivity(Intent(this, M3N5MisolActivity::class.java))
        }
        binding.btn6.setOnClickListener {
            startActivity(Intent(this, M3N6MisolActivity::class.java))
        }
        binding.btn7.setOnClickListener {
            startActivity(Intent(this, M3N7MisolActivity::class.java))
        }
        binding.btn8.setOnClickListener {
            startActivity(Intent(this, M3N8MisolActivity::class.java))
        }
        binding.btn9.setOnClickListener {
            startActivity(Intent(this, M3N9MisolActivity::class.java))
        }
        binding.btn10.setOnClickListener {
            startActivity(Intent(this, M3N10MisolActivity::class.java))
        }
        binding . btn11 . setOnClickListener {
            startActivity(Intent(this, M3N11MisolActivity::class.java))
        }
        binding . btn12 . setOnClickListener {
            startActivity(Intent(this, M3N12MisolActivity::class.java))
        }
        binding . btn13 . setOnClickListener {
            startActivity(Intent(this, M3N13MisolActivity::class.java))
        }
        binding . btn14 . setOnClickListener {
            startActivity(Intent(this, M3N14MisolActivity::class.java))
        }
        binding . btn15 . setOnClickListener {
            startActivity(Intent(this, M3N15MisolActivity::class.java))
        }
        binding . btn16 . setOnClickListener {
            startActivity(Intent(this, M3N16MisolActivity::class.java))
        }
        binding . btn17 . setOnClickListener {
            startActivity(Intent(this, M3N17MisolActivity::class.java))
        }
        binding . btn18 . setOnClickListener {
            startActivity(Intent(this, M3N18MisolActivity::class.java))
        }
        binding . btn19 . setOnClickListener {
            startActivity(Intent(this, M3N19MisolActivity::class.java))
        }
        binding . btn20 . setOnClickListener {
            startActivity(Intent(this, M3N20MisolActivity::class.java))
        }
    }
}