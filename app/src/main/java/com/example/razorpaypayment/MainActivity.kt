package com.example.razorpaypayment

import android.content.Intent
import android.database.DatabaseUtils
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.razorpaypayment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this ,R.layout.activity_main)


        binding.frameItem.setOnClickListener {
            val intent = Intent(this, ProductDetailsActivity::class.java)
            startActivity(intent)
        }

    }
}