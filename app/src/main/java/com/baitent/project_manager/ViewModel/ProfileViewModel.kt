package com.baitent.project_manager.ViewModel

import androidx.lifecycle.ViewModel
import com.baitent.project_manager.Repository.ProfileRepository

class ProfileViewModel(val repository: ProfileRepository) : ViewModel(){
    constructor():this(ProfileRepository())

    fun loadDataProjects()= repository.myProjectItems
}