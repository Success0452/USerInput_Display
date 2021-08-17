package com.famous.namedisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.famous.namedisplay.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       val input = binding.input.text.trim()
        binding.displayBtn.setOnClickListener {
            binding.displayTxt.text = input.toString()
        }

    }
}