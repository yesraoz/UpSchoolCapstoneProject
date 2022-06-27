package com.yesraoz.capstoneproject.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.yesraoz.capstoneproject.R
import com.yesraoz.capstoneproject.databinding.ActivityAfterLoginBinding

class AfterLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAfterLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAfterLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(binding.fragmentContainerView.id) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNavMenu, navController)

        val bottomNavigationView = binding.bottomNavMenu
        setSupportActionBar(binding.toolbar)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.mainPageFragment))

        binding.toolbar.setupWithNavController(
            navController,
            appBarConfiguration
        )

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.mainPageFragment -> bottomNavigationView.visibility = View.GONE
                R.id.shopMenu -> bottomNavigationView.visibility = View.VISIBLE
                R.id.bagMenu -> bottomNavigationView.visibility = View.VISIBLE
                R.id.favMenu -> bottomNavigationView.visibility = View.VISIBLE
                R.id.profileMenu -> bottomNavigationView.visibility = View.VISIBLE

            }
        }
    }
}