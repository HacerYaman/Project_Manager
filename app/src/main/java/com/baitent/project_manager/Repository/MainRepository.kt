package com.baitent.project_manager.Repository

import com.baitent.project_manager.Domain.OngoingModel

class MainRepository {
    val items= listOf(
        OngoingModel("Food App", "June 21, 2024", 50, "ongoing1"),
        OngoingModel("Date App", "June 15, 2024", 40, "ongoing2"),
        OngoingModel("Learn App", "June 14, 2024", 72, "ongoing3"),
        OngoingModel("Game App", "June 12, 2024", 49, "ongoing4"),
    )
}