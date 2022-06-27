package com.yesraoz.capstoneproject.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.yesraoz.capstoneproject.R
import com.yesraoz.capstoneproject.databinding.ActivityBeforeloginBinding

class BeforeLoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityBeforeloginBinding
    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBeforeloginBinding.inflate(layoutInflater)
        binding.toolbar.title=""
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val navHostFragment=supportFragmentManager.findFragmentById(binding.fragmentContainerView.id) as NavHostFragment

        val navController= navHostFragment.navController

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.mainPageFragment,R.id.signUpFragment))

        binding.toolbar.setupWithNavController(
            navController,
            appBarConfiguration
        )

    }

    override fun onSupportNavigateUp(): Boolean {
        applicationContext
        findNavController(R.id.fragmentContainerView).popBackStack()
        return true
    }
}