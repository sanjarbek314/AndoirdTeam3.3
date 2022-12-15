package com.example.andoirdteam33

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            if (binding.login.text.toString() == "sanjar" && binding.parol.text.toString()=="123456") {
                startActivity(Intent(this, Svetafor_new_app_activity::class.java))
            } else {
                Toast.makeText(this, "parol yoki login xato", Toast.LENGTH_SHORT).show()
            }
        }


    }
}