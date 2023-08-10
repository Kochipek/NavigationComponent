package com.kochipek.navigationlogin.ecommerce

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kochipek.navigationlogin.R
import com.kochipek.navigationlogin.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentHomeBinding.bind(view)
        val navController = findNavController()
        super.onViewCreated(view, savedInstanceState)
        binding.btnElectronics.setOnClickListener {
            // using safe args to navigate to LoginFragment from HomeFragment (action)
            val action = HomeFragmentDirections.actionHomeFragmentToElectronicsGraph()
            navController.navigate(action)
        }
        binding.btnFashion.setOnClickListener {
            // using safe args to navigate to LoginFragment from HomeFragment (action)
            val action = HomeFragmentDirections.actionHomeFragmentToFashionGraph()
            navController.navigate(action)
        }
    }
}