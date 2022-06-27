package com.yesraoz.capstoneproject.Adapter

import com.yesraoz.capstoneproject.Models.Product
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yesraoz.capstoneproject.databinding.ItemMainPageBinding
import com.yesraoz.capstoneproject.fragment.MainPageFragmentDirections

class MainPageAdapter
    (var products: List<Product>) : RecyclerView.Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMainPageBinding.inflate(inflater, parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.binding.apply {
            productTitleTextView.text = product.productName
            productPriceTextView.text = "$" + product.price
            Glide.with(this.root).load(product.image).into(productImageView)
            productCardView.setOnClickListener {
                val action = MainPageFragmentDirections.mainPageswitchtoProductCard(product)
               Navigation.findNavController(it).navigate(action)
            }
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}


class ProductViewHolder(val binding: ItemMainPageBinding) :
    RecyclerView.ViewHolder(binding.root)
