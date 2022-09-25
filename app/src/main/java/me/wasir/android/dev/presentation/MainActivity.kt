package me.wasir.android.dev.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import me.wasir.android.dev.R
import me.wasir.android.dev.databinding.ActivityMainBinding
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val navController = findNavController(R.id.nav_host_fragment_activity_main)
//        binding.navView.setupWithNavController(navController)
    }
}