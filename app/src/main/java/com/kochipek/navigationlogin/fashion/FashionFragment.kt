package com.kochipek.navigationlogin.fashion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kochipek.navigationlogin.R
import com.kochipek.navigationlogin.databinding.FragmentFashionBinding

class FashionFragment : Fragment(R.layout.fragment_fashion) {
    private lateinit var binding: FragmentFashionBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFashionBinding.bind(view)

            binding.mensClothesButton.setOnClickListener {
                val action =
                    FashionFragmentDirections.actionFashionFragmentToMensClothingFragment()
                findNavController().navigate(action)
            }
        binding.womensClothesButton.setOnClickListener {
            val action =
                FashionFragmentDirections.actionFashionFragmentToWomensClothingFragment()
            findNavController().navigate(action)
        }
    }
}