package com.baitent.project_manager.ViewModel

import androidx.lifecycle.ViewModel
import com.baitent.project_manager.Repository.MainRepository

class MainViewModel(val repository: MainRepository) : ViewModel() {
    constructor():this(MainRepository())
    fun loadData()=repository.items //ongoing ekranındakileri load etme

}