package com.yesraoz.capstoneproject.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.yesraoz.capstoneproject.Adapter.MainPageAdapter
import com.yesraoz.capstoneproject.Api.ProductApiService
import com.yesraoz.capstoneproject.Models.Product
import com.yesraoz.capstoneproject.R
import com.yesraoz.capstoneproject.databinding.FragmentMainPageBinding
import com.yesraoz.capstoneproject.databinding.FragmentProductDetailBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProductDetailFragment : Fragment() {

    private lateinit var binding: FragmentProductDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentProductDetailBinding.inflate(inflater,container, false)

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

        Glide.with(this).load(product.image).into(binding.productImage)
    }

}