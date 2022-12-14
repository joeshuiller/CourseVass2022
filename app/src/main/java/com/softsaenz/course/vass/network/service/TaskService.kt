package com.softsaenz.course.vass.network.service

import com.softsaenz.course.vass.network.service.db.SaveTaskDto
import com.softsaenz.course.vass.network.service.db.TaskListDto
import retrofit2.Response
import retrofit2.http.*

interface TaskService {
    /**
     * @author Janes Saenz
     * 19/10/21.
     */
    @POST("api/task")
    suspend fun saveTask(@Body saveTaskDto: SaveTaskDto): Response<SaveTaskDto>
    @GET("api/task/all")
    suspend fun getTaskList(): Response<List<TaskListDto>>
    @DELETE("api/task/{id}")
    suspend fun deleteTask(@Path("id") taskId: String): Response<Void>
}