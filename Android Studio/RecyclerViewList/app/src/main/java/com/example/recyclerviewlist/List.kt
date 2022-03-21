package com.example.recyclerviewlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlist.adapter.AdapterTask
import com.example.recyclerviewlist.model.Task

class List : Fragment() {


    // Inflate the layout for this fragment
    /*
    Reciclyer view: (Passos a serem tomados)
    Layout dos itens
    Listagem dos itens -> Classe Modelo + Listagem de itens
    Adapter -> Configurar um adapter(Cuida dos dados da lista) junto a ViewHolder(Diz qual layout sera exibido)
    Instanciar e configurar a RecyclerView dentro do Fragment
     */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_list, container, false)

        //Gerando lista de tarefas:
        val listTask = mutableListOf(
            Task("Clean House", "Do in the morning", "Me", "2022-03-21",true, "Daily Routine"),
            Task("Play", "All Day Long", "Me", "2022-03-21",true, "Must Do"),
            Task("Physical Exercise", "Morning and Night Time", "Me", "2022-03-21",false, "Healthy")
        )

        //Configurar o Adapter:

        val recyclerL = view.findViewById<RecyclerView>(R.id.recyclerL)

        //instanciar o Adapter
        val adapter = AdapterTask()

        //Definir o Layout Manager da RecyclerView
        recyclerL.layoutManager = LinearLayoutManager(context)

        //Configurar o adapter para o recycler (Lista)
        recyclerL.adapter = adapter //Ou recyclerTask.adapter = taskAdapter

        //Definir um tamanho fixado para a lista, idependente dos itens
        recyclerL.setHasFixedSize(true)

        //
        adapter.setList(listTask)

        return view

    }


}