package com.kochipek.navigationlogin.ecommerce

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kochipek.navigationlogin.R
import com.kochipek.navigationlogin.databinding.FragmentCartBinding

class CartFragment : Fragment(R.layout.fragment_cart) {
    private lateinit var binding: FragmentCartBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentCartBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.btnPurchase.setOnClickListener {
            Toast.makeText(context, "Purchase Successful", Toast.LENGTH_SHORT).show()
        }
    }
}