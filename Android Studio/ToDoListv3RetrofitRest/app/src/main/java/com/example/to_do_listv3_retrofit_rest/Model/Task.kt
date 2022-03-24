package com.example.to_do_listv3_retrofit_rest.Model

data class Task (
    var id:Long,
    var nome:String,
    var descricao:String,
    var responsavel:String,
    var data:String,
    var status: Boolean,
    var categoria: Category
        )
{
}