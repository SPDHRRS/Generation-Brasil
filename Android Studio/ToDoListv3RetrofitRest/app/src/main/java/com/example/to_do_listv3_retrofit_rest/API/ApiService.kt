package com.example.to_do_listv3_retrofit_rest.API

import com.example.to_do_listv3_retrofit_rest.Model.Category
import com.example.to_do_listv3_retrofit_rest.Model.Task
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @GET( "categoria")
    suspend fun listCategory(): Response<List<Category>>

    @POST("tarefa")
    suspend fun addTask( @Body tarefa: Task) : Response<Task>

    @GET("tarefa")
    suspend fun listTask() : Response<List<Task>>

    @PUT("tarefa")
    suspend fun updateTask(@Body tarefa : Task) : Response<Task>

    @DELETE("tarefa/{id}")
    suspend fun deleteTask(@Path("id") value : Long) : Response<List<Task>>
}
