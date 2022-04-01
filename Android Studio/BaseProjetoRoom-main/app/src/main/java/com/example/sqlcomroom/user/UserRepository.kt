package com.example.sqlcomroom.user

import androidx.lifecycle.LiveData

class UserRepository (private val userDAO : UserDAO) {

    val lerTodosOsDados : LiveData<List<User>> = userDAO.lerTodosOsDados()

    fun addUser(user : User){
        userDAO.addUser(user)
    }
}