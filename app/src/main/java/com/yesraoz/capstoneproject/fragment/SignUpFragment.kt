package com.yesraoz.capstoneproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yesraoz.capstoneproject.R
import kotlinx.android.synthetic.main.fragment_sign_up.view.*

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

         val design = inflater.inflate(R.layout.fragment_sign_up, container, false)

        design.btnSignUp.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.switchtoLoginScreen)
        }

        return design
    }


}