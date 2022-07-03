package com.news.viewmodelsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.news.viewmodelsimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel : MainActivityViewModel
    private lateinit var viewModelFactory:MainViewModelFactory
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory=MainViewModelFactory(100)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)
        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.button.setOnClickListener {
            binding.countText.text = viewModel.getUpdateCount().toString()
        }


    }
}
