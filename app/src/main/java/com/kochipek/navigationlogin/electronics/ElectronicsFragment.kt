package com.kochipek.navigationlogin.electronics

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kochipek.navigationlogin.R
import com.kochipek.navigationlogin.databinding.FragmentElectronicsBinding

class ElectronicsFragment : Fragment(R.layout.fragment_electronics) {
   private lateinit var binding: FragmentElectronicsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentElectronicsBinding.bind(view)

            binding.computersButton.setOnClickListener {
                val action =
                    ElectronicsFragmentDirections.actionElectronicsFragmentToComputersFragment()
                findNavController().navigate(action)
            }
        binding.phonesButton.setOnClickListener {
            val action =
                ElectronicsFragmentDirections.actionElectronicsFragmentToPhonesFragment()
            findNavController().navigate(action)
        }
    }}