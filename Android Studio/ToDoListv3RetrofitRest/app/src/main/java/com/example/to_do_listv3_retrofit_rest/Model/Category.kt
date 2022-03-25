package com.example.to_do_listv3_retrofit_rest.Model

data class Category(
    var id: Long,
    var descricao:String,
    var tarefas:List<Task>
)
{
    override fun toString(): String {
        return descricao!!
    }
}