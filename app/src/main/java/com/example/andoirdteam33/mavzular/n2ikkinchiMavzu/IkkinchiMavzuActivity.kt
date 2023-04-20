package com.example.androidteam32.mavzular.ikkinchiMavzu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityIkkinchiMavzuBinding
import com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala.*
import com.example.androidteam32.mavzular.ikkinchiMavzu.masala.BinchiMasala2Activity
import com.example.androidteam32.mavzular.ikkinchiMavzu.masala.IkkinchiMasala2

class IkkinchiMavzuActivity : AppCompatActivity() {
    lateinit var binding: ActivityIkkinchiMavzuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIkkinchiMavzuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, BinchiMasala2Activity::class.java))
        }
        binding.btn2.setOnClickListener {
            startActivity(Intent(this, IkkinchiMasala2::class.java))
        }
        binding.btn3.setOnClickListener {
            startActivity(Intent(this, UchinchiMasala2Activity::class.java))
        }
        binding.btn4.setOnClickListener {
            startActivity(Intent(this, TorTinchiMasala2Activity::class.java))
        }
        binding.btn5.setOnClickListener {
            startActivity(Intent(this, BeshinchiMasala2Activity::class.java))
        }
        binding.btn6.setOnClickListener {
            startActivity(Intent(this, OltiNchiMasala2Activity::class.java))
        }
        binding.btn7.setOnClickListener {
            startActivity(Intent(this, YettinchiMasala2Activity::class.java))
        }
        binding.btn8.setOnClickListener {
            startActivity(Intent(this, SakkizinchiMasala2Activity::class.java))
        }
        binding.btn9.setOnClickListener {
            startActivity(Intent(this, ToqqizinchiMasala2Activity::class.java))
        }
        binding.btn10.setOnClickListener {
            startActivity(Intent(this, OninchiMasala2Activity::class.java))
        }
        binding . btn11 . setOnClickListener {
            startActivity(Intent(this, OnBirinchiMasala2Activity::class.java))
        }
        binding . btn12 . setOnClickListener {
            startActivity(Intent(this, OnIkkinchiMasala2Activity::class.java))
    }
        binding . btn13 . setOnClickListener {
            startActivity(Intent(this, OnUchinchiMasala2Activity::class.java))
    }
        binding . btn14 . setOnClickListener {
            startActivity(Intent(this, M2N14MisolActivity::class.java))
    }
        binding . btn15 . setOnClickListener {
            startActivity(Intent(this, M2N15MisolActivity::class.java))
    }
        binding . btn16 . setOnClickListener {
            startActivity(Intent(this, M2N16MisoloActivity::class.java))
    }
        binding . btn17 . setOnClickListener {
            startActivity(Intent(this, M2N17MisolActivity::class.java))
    }
        binding . btn18 . setOnClickListener {
            startActivity(Intent(this, M2N18MisolActivity::class.java))
    }
        binding . btn19 . setOnClickListener {
            startActivity(Intent(this, M2N19MisolActivity::class.java))
    }
        binding . btn20 . setOnClickListener {
            startActivity(Intent(this, M2N20MisolActivity::class.java))
    }

    }
}