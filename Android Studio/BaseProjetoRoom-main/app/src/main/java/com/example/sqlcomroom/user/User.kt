package com.example.sqlcomroom.user

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var nome: String,
    var sobrenome: String,
    var idade: Int
        ){
}