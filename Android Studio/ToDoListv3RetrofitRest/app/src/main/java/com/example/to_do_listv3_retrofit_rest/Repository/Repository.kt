package com.example.to_do_listv3_retrofit_rest.Repository

import com.example.to_do_listv3_retrofit_rest.API.RetrofitInstance
import com.example.to_do_listv3_retrofit_rest.Model.Category
import retrofit2.Response

class Repository {

    suspend fun listCategory() : Response<List<Category>>{
        return RetrofitInstance.api.listCategory()
    }
}