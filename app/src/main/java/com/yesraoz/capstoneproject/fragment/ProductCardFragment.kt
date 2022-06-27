package com.yesraoz.capstoneproject.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.yesraoz.capstoneproject.R
import com.yesraoz.capstoneproject.databinding.FragmentProductCardBinding
import com.yesraoz.capstoneproject.databinding.FragmentProductDetailBinding
import kotlinx.android.synthetic.main.fragment_product_card.view.*


class ProductCardFragment : Fragment() {


    private lateinit var binding: FragmentProductCardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentProductCardBinding.inflate(inflater,container, false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args:ProductCardFragmentArgs by navArgs()
        val product= args.product

        Log.e("dıhfhfgj", product.toString())
        binding.productName.text =product.productName
        binding.productDescription.text=product.description
        binding.productPrice.text=product.price
        binding.productStar.text=product.rate

        Glide.with(binding.root).load(product.image).into(binding.productImage)
    }

}