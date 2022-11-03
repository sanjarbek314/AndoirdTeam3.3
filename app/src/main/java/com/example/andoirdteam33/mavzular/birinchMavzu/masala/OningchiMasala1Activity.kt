package com.example.andoirdteam33.mavzular.birinchMavzu.masala

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andoirdteam33.databinding.ActivityOningchiMasala1Binding

class OningchiMasala1Activity : AppCompatActivity() {
    lateinit var binding: ActivityOningchiMasala1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOningchiMasala1Binding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btn1.setOnClickListener {
        if (binding.chiziq.text.toString().isNotEmpty() && binding.chiziq1.text.toString()
                .isNotEmpty()
        ) {
            if (0 < binding.chiziq.text.toString()
                    .toInt() && 0 < binding.chiziq1.text.toString().toInt()
            ) {
                binding.misol.text = "yig'indisi=${binding.chiziq.text.toString().toInt() + binding.chiziq1.text.toString().toInt()
                }\nko'paytmasi=${
                    binding.chiziq.text.toString().toInt() * binding.chiziq1.text.toString()
                        .toInt()
                }\nkvadrati=${
                    binding.chiziq.text.toString().toInt() * binding.chiziq.text.toString()
                        .toInt() * binding.chiziq1.text.toString()
                        .toInt() * binding.chiziq1.text.toString().toInt()
                }"
            }
        } else {
            Toast.makeText(this, "raqam kiritin!!!", Toast.LENGTH_SHORT).show()
        }

    }

}
}