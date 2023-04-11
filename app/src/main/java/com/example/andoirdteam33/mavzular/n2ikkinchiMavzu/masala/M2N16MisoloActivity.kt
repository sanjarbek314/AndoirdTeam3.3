package com.example.andoirdteam33.mavzular.n2ikkinchiMavzu.masala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andoirdteam33.databinding.ActivityM2N15MisolBinding
import com.example.andoirdteam33.databinding.ActivityM2N16MisoloBinding

class M2N16MisoloActivity : AppCompatActivity() {
    lateinit var binding: ActivityM2N16MisoloBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM2N16MisoloBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}