package com.yesraoz.capstoneproject.fragment
import com.yesraoz.capstoneproject.Adapter.MainPageAdapter
import com.yesraoz.capstoneproject.Api.ProductApiService
import com.yesraoz.capstoneproject.Models.Product
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.yesraoz.capstoneproject.R
import com.yesraoz.capstoneproject.databinding.FragmentMainPageBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding
    private lateinit var adapter:MainPageAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var list = arrayListOf<Product>()
        APIInstance.getInstance().create(ProductApiService::class.java).getProducts()
            .enqueue(object : Callback<ArrayList<Product>> {
                override fun onResponse(
                    call: Call<ArrayList<Product>>,
                    response: Response<ArrayList<Product>>
                ) {
                    if (response.isSuccessful) {
                        list = response.body()!!

                        adapter= MainPageAdapter(list)
                        val layoutManager = LinearLayoutManager(context)
                        binding.mainPageRecyclerView.layoutManager = layoutManager
                        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

                        binding.mainPageRecyclerView.adapter = adapter
                    }
                    else{
                        Log.e("hata",response.errorBody().toString())
                    }
                }

                override fun onFailure(call: Call<ArrayList<Product>>, t: Throwable) {
                    Log.e("hata",t.message.toString())

                }

            })
    }


}