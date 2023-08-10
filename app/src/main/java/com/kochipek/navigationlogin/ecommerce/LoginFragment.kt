package com.kochipek.navigationlogin.ecommerce

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kochipek.navigationlogin.R
import com.kochipek.navigationlogin.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentLoginBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()

        binding.btnConfirm.setOnClickListener{
            var username = binding.Username.text.toString()
            var password = binding.Password.text.toString()
            val action = LoginFragmentDirections.actionLoginFragmentToProfileFragment(username, password)
            navController.navigate(action)
        }
    }

}