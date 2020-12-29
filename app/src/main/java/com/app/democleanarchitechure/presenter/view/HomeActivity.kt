package com.app.democleanarchitechure.presenter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.app.democleanarchitechure.R
import com.app.democleanarchitechure.databinding.ActivityHomeBinding
import com.app.democleanarchitechure.presenter.viewModel.HomeViewModel
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var binding: ActivityHomeBinding
    lateinit var homeViewModel: HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        setupViewModel()

    }

    private fun setupViewModel() {
        homeViewModel =  ViewModelProviders.of(this,viewModelFactory).get(HomeViewModel::class.java)
        binding.viewModel=homeViewModel
    }

}
