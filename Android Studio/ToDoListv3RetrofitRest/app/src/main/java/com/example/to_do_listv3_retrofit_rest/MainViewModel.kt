package com.example.to_do_listv3_retrofit_rest

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.to_do_listv3_retrofit_rest.Model.Category
import com.example.to_do_listv3_retrofit_rest.Repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception
import java.util.*
import javax.inject.Inject

@HiltViewModel //Indica que nossa ViewModel vai injetar dependencias
class MainViewModel @Inject constructor (val repository: Repository) : ViewModel() {

    private val _responseListCategory = MutableLiveData<Response<List<Category>>>()

    val responseListCategory: LiveData<Response<List<Category>>> = _responseListCategory

    init{listCategory()}

    fun listCategory(){
        /*
        Declarar a nossa corrotina (ou seja, a Thread secundária que o
        método vai rodar)
        Como vamos executar a requisição dentro da ViewModel, utilizaremos a nossa
        corrotina no escopo da ViewModel (viewModelScope)
        */
        viewModelScope.launch {
            try{
                val response = repository.listCategory()
                _responseListCategory.value = response
            }catch (e:Exception){
                Log.d("RequisitionError", e.message.toString())
            }
        }
    }
}