package com.example.sqlcomroom

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sqlcomroom.user.User
import com.example.sqlcomroom.user.UserDataBase
import com.example.sqlcomroom.user.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserVM(context: Context?) : ViewModel() {

    val lerTodosOsDados : LiveData<List<User>>
    private val repository : UserRepository

    init {
        val userDAO = UserDataBase.getDataBase(context!!).userDAO()
        repository = UserRepository(userDAO)
        lerTodosOsDados = repository.lerTodosOsDados
    }
    fun addUser(user : User){
        viewModelScope.launch (Dispatchers.IO) {
            repository.addUser(user)
        }
    }
}