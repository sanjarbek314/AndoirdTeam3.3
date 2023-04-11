package com.example.andoirdteam33.mavzular.n6OltinchiMavzu.masalalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.andoirdteam33.databinding.ActivityM6N20MisolBinding

class M6N20MisolActivity : AppCompatActivity() {
    lateinit var binding:ActivityM6N20MisolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityM6N20MisolBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}