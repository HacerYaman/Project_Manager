package com.baitent.project_manager.Activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.baitent.project_manager.Adapter.OngoingAdapter
import com.baitent.project_manager.ViewModel.MainViewModel
import com.baitent.project_manager.databinding.ActivityMainBinding

class DashboardActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val mainViewModel:MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val ongoingAdapter by lazy {
                OngoingAdapter(mainViewModel.loadData())
            }
            viewOngoing.apply {
                adapter=ongoingAdapter
                layoutManager = GridLayoutManager(this@DashboardActivity, 2)
            }
        }
    }
}