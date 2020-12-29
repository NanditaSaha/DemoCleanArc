package com.app.democleanarchitechure.presenter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.democleanarchitechure.R
import com.app.democleanarchitechure.databinding.ActivityHomeBinding
import com.app.democleanarchitechure.domain.module.RecipeModule
import com.app.democleanarchitechure.presenter.viewModel.HomeViewModel
import com.app.democleanarchitechure.presenter.viewModel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_home.*

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
        getResponse()
    }

    private fun setupViewModel() {

        homeViewModel =  ViewModelProviders.of(this,viewModelFactory).get(HomeViewModel::class.java)
        binding.viewModel=homeViewModel
        lifecycle.addObserver(homeViewModel)
    }
    private fun getResponse()
    {
        with(homeViewModel) {
            homeData.observe(this@HomeActivity, Observer {
                initView(it)
            }
            )
            error.observe(this@HomeActivity, Observer {
               // progressBar_home.visibility= View.GONE
                Toast.makeText(this@HomeActivity, "${it?.message}", Toast.LENGTH_LONG).show()
            })
        }
    }

    private fun initView(it: RecipeModule?) {
//        rv_home_list.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

}
