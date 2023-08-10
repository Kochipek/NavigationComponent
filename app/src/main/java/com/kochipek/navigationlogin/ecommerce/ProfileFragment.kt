package com.kochipek.navigationlogin.ecommerce

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.kochipek.navigationlogin.R
import com.kochipek.navigationlogin.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private lateinit var binding: FragmentProfileBinding

    // sending data from LoginFragment to ProfileFragment using SafeArgs
    private val args : ProfileFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentProfileBinding.bind(view)
        val navController = findNavController()
        super.onViewCreated(view, savedInstanceState)
        // receiving data from LoginFragment with SafeArgs
        binding.dispUsername.text = args.username
        binding.dispPassword.text = args.password

        binding.btnBack.setOnClickListener{
            val action = ProfileFragmentDirections.actionProfileFragmentToHomeFragment()
            findNavController().navigate(action)
        }

    }

}