package com.kochipek.navigationlogin

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kochipek.navigationlogin.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentHomeBinding.bind(view)
        val navController = findNavController()
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            // using safe args to navigate to LoginFragment from HomeFragment (action)
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
            navController.navigate(action)
        }
    }
}