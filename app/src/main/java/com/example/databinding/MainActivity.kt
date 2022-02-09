package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val s:Student = Student("W123456","Abu" )
        binding.student = s
        //binding.tvStudName.text = s.name
        //binding.tvStudID.text = s.id

        binding.btnUpdate.setOnClickListener(){
            s.name = "Alex"
            binding.apply {
                invalidateAll()
            }
        }
    }
}