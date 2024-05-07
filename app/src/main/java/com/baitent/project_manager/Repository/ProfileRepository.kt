package com.baitent.project_manager.Repository

import com.baitent.project_manager.Domain.ProjectDomain

class ProfileRepository {
    val myProjectItems: MutableList<ProjectDomain> = mutableListOf(
        ProjectDomain("Date App", "In Progress"),
        ProjectDomain("Food App", "In Progress"),
        ProjectDomain("Project App", "Completed"),
        ProjectDomain("Habit App", "In Progress"),
    )

}
