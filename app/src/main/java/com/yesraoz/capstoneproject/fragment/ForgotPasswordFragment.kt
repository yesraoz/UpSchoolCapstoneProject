package com.yesraoz.capstoneproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yesraoz.capstoneproject.R
import kotlinx.android.synthetic.main.fragment_forgot_password.view.*

class ForgotPasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val design =inflater.inflate(R.layout.fragment_forgot_password, container, false)

        design.btnSend.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.actiontologinFragment)
        }


        return design
    }

}