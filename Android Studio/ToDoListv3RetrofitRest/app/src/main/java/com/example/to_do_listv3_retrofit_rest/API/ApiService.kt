package com.example.to_do_listv3_retrofit_rest.API

import com.example.to_do_listv3_retrofit_rest.Model.Category
import retrofit2.Response
import retrofit2.http.GET
interface ApiService {

    @GET( "categoria")
    suspend fun listCategory(): Response<List<Category>>
}
