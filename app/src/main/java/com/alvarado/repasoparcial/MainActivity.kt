package com.alvarado.repasoparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.alvarado.repasoparcial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        /*binding.actionChange.setOnClickListener{
            //navController.navigate(R.id.action_homeFragment_to_secondFragment)//Pasamos al otro fragment
            //navController.navigate(R.id.secondFragment)

            //Para pasar los datos
            val action = HomeFragmentDirections.actionHomeFragmentToSecondFragment(
                (1..100).random().toString()
            )
            //cambio de fragment
            navController.navigate(action)
        }*/
    }
}