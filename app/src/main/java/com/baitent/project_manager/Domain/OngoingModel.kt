package com.baitent.project_manager.Domain

data class OngoingModel(
    var title: String,
    var data: String,
    var progressPercent:Int,
    var picPath:String,
)