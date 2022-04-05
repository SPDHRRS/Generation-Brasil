package com.example.to_do_listv3_retrofit_rest

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.to_do_listv3_retrofit_rest.Model.Category
import com.example.to_do_listv3_retrofit_rest.Model.Task
import com.example.to_do_listv3_retrofit_rest.Repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel //Indica que nossa ViewModel vai injetar dependencias
class MainViewModel @Inject constructor (val repository: Repository) : ViewModel() {

    private val _responseListCategory = MutableLiveData<Response<List<Category>>>()
    val responseListCategory: LiveData<Response<List<Category>>> = _responseListCategory

    private val _myTaskResponse = MutableLiveData<Response<List<Task>>>()
    val myTaskResponse: LiveData<Response<List<Task>>> = _myTaskResponse

    val selectedData = MutableLiveData<LocalDate>()

    var selectedTask : Task? = null

    init{
        selectedData.value = LocalDate.now()
        listCategory()
    }

    fun listCategory(){
        // Declarar a nossa corrotina (ou seja, a Thread secundária que o método vai rodar)
        //Como vamos executar a requisição dentro da ViewModel, utilizaremos a nossa corrotina no escopo da ViewModel (viewModelScope)
        viewModelScope.launch {
            try{
                val response = repository.listCategory()
                _responseListCategory.value = response
            }catch (e:Exception){
                Log.d("RequisitionError", e.message.toString())
            }
        }
    }
    fun addTask(tarefa : Task){
        viewModelScope.launch {
            try {
                repository.addTask(tarefa)
                listTask()
            }catch (e: Exception){
                Log.d("Error", e.message.toString())
            }
        }
    }
    fun listTask(){
        viewModelScope.launch {
            try{
                val response =  repository.listTask()
                _myTaskResponse.value = response
            }catch (e: Exception){ Log.d("Developer", "Error", e) }
        }
    }
    fun updateTask(tarefa : Task){
        viewModelScope.launch {
            try{
                repository.updateTask(tarefa)
                listTask()
            }catch (e: Exception){
                Log.d("Error2", e.message.toString())
            }
        }
    }
    fun rmvTask(id : Long){
        viewModelScope.launch {
            try{
                repository.delTask(id)
                listTask()
            }catch (e : Exception){
                Log.d("Error3", e.message.toString())
            }
        }
    }
}