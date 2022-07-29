package com.softsaenz.course.vass.network.service.db

data class TaskListDto(
    val id: String,
    val name: String,
    val description: String,
    val status: String,
    val assignedTo: String,
    val dueDate: String
)