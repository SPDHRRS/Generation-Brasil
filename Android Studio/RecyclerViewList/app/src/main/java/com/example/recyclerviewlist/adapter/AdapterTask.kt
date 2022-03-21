package com.example.recyclerviewlist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlist.R
import com.example.recyclerviewlist.model.Task

//RecyclerView.Adapter<>()
//Configurar a classe para virar um ViewHolder:
class AdapterTask : RecyclerView.Adapter<AdapterTask.TaskViewHolder>() {

    private var taskL = emptyList<Task>()

    class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val textName = view.findViewById<TextView>(R.id.textName)
        val textDescription = view.findViewById<TextView>(R.id.textDescription)
        val textOwner = view.findViewById<TextView>(R.id.textOwner)
        val textDate = view.findViewById<TextView>(R.id.textDate)
        val textActiveCard = view.findViewById<Switch>(R.id.switchCardActive)
        val textCategory = view.findViewById<TextView>(R.id.textCategory)
        val buttonDelete = view.findViewById<TextView>(R.id.buttonDelete)

    }

    //Onde sera definido qual layout sera utilizado para os itens
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_task, parent, false)
        return TaskViewHolder(layout)
    }

    //Onde sera processado os dados da lista
    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskL[position]

        holder.textName.text = task.name
        holder.textDescription.text = task.description
        holder.textOwner.text = task.owner
        holder.textDate.text = task.date
        holder.textActiveCard.isChecked = task.status
        holder.textCategory.text = task.category
    }

    //Onde sera definido para o adapter quantos itens existem na lista
    override fun getItemCount(): Int {
        return taskL.size
    }
    fun setList(List: List<Task>){

        taskL = List
        notifyDataSetChanged()

    }
}