package com.example.to_do_listv3_retrofit_rest.Repository

import com.example.to_do_listv3_retrofit_rest.API.RetrofitInstance
import com.example.to_do_listv3_retrofit_rest.Model.Category
import com.example.to_do_listv3_retrofit_rest.Model.Task
import retrofit2.Response

class Repository {

    suspend fun listCategory() : Response<List<Category>>{
        return RetrofitInstance.api.listCategory()
    }
    suspend fun addTask(tarefa : Task) : Response<Task>{

        return RetrofitInstance.api.addTask(tarefa)
    }
    suspend fun listTask() : Response<List<Task>>{
        return RetrofitInstance.api.listTask()
    }
    suspend fun updateTask(tarefa : Task) : Response<Task>{
        return RetrofitInstance.api.updateTask(tarefa)
    }
    suspend fun delTask(id : Long) : Response<List<Task>> {
        return RetrofitInstance.api.deleteTask(id)
    }
}