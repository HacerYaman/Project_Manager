package com.baitent.project_manager.Activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.baitent.project_manager.Adapter.MyProjectsAdapter
import com.baitent.project_manager.ViewModel.ProfileViewModel
import com.baitent.project_manager.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    val profileViewModel: ProfileViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val myProjectAdapter by lazy { MyProjectsAdapter(profileViewModel.loadDataProjects()) }
            viewProjects.apply {
                adapter = myProjectAdapter
                layoutManager =
                    LinearLayoutManager(this@ProfileActivity, LinearLayoutManager.VERTICAL, false)
            }
        }



    }
}