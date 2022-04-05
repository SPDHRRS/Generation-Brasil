package com.example.to_do_listv3_retrofit_rest.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowId
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.to_do_listv3_retrofit_rest.API.ApiService
import com.example.to_do_listv3_retrofit_rest.MainViewModel
import com.example.to_do_listv3_retrofit_rest.Model.Task
import com.example.to_do_listv3_retrofit_rest.R
import com.example.to_do_listv3_retrofit_rest.Repository.Repository
import retrofit2.http.DELETE

class TaskAdapter (private val taskItemClickListener: TaskItemClickListener, private val mainViewModel: MainViewModel) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    private var listTask = emptyList<Task>()

    class TaskViewHolder (view:View): RecyclerView.ViewHolder(view){

        val textName = view.findViewById<TextView>(R.id.textName)
        val textDescription = view.findViewById<TextView>(R.id.textDesciption)
        val textOwner = view.findViewById<TextView>(R.id.textOwner)
        val textData = view.findViewById<TextView>(R.id.textData)
        val switchCard = view.findViewById<Switch>(R.id.switchCard)
        val textCategory = view.findViewById<TextView>(R.id.textCategory)
        val buttonDelete = view.findViewById<Button>(R.id.buttonDelete)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {

        val layout = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_task, parent, false)

        return TaskViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = listTask[position]

        holder.textName.text = task.nome
        holder.textDescription.text = task.descricao
        holder.textOwner.text = task.responsavel
        holder.textData.text = task.data
        holder.switchCard.isChecked = task.status
        holder.textCategory.text = task.categoria.descricao

        holder.buttonDelete.setOnClickListener {
            mainViewModel.rmvTask(task.id)
        }

        holder.switchCard.setOnCheckedChangeListener { compoundButton, ativo -> task.status = ativo
        mainViewModel.updateTask(task) }

        holder.itemView.setOnClickListener{
            taskItemClickListener.onTaskClicked(task)
        }

    }

    override fun getItemCount(): Int {
        return listTask.size
    }
    fun setList(list:List<Task>){
        listTask = list
        notifyDataSetChanged()
    }

}