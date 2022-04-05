package com.example.to_do_listv3_retrofit_rest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.to_do_listv3_retrofit_rest.Model.Category
import com.example.to_do_listv3_retrofit_rest.Model.Task
import com.example.to_do_listv3_retrofit_rest.databinding.FragmentFormularyBinding
import com.example.to_do_listv3_retrofit_rest.fragments.DatePickerFragment
import com.example.to_do_listv3_retrofit_rest.fragments.TimePickerListener
import java.time.LocalDate

class FormularyFrag : Fragment() , TimePickerListener{

    private lateinit var binding: FragmentFormularyBinding
    //Declarando uma instancia de ViewModel Compartilhada: (by activityViewModels())
    private val mainViewModel: MainViewModel by activityViewModels()

    private var chosenCategory = 0L

    private var selectedTask : Task? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainViewModel.responseListCategory.observe(viewLifecycleOwner) { response -> Log.d("Requisition", response.body().toString())
            spinnerCategory(response.body())
        }

        mainViewModel.selectedData.observe(viewLifecycleOwner){
            selectedDate -> binding.editTDat.setText(selectedDate.toString())
        }

        // Inflate the layout for this fragment
        binding = FragmentFormularyBinding.inflate(layoutInflater,container, false)

        loadInfo()

        binding.buttonSave.setOnClickListener {
            insertIntoBank()
        }

        binding.editTDat.setOnClickListener {
            DatePickerFragment(this).show(parentFragmentManager, "DatePicker")
        }

        return binding.root
    }

    fun spinnerCategory(categories: List<Category>?){
        if(categories != null){
            binding.spinnerCategory.adapter = ArrayAdapter(requireContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, categories)

            binding.spinnerCategory.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    val chosenCategoryFun = binding.spinnerCategory.selectedItem as Category

                    chosenCategory = chosenCategoryFun.id
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }
    }
    fun formValidator(name:String, description:String, owner:String, data: String) : Boolean{
        return !(
                (name == "" || name.length < 3 || name.length > 20) ||
                        (description == "" || description.length < 5 || description.length > 200) ||
                        (owner == "" || owner.length < 3 || owner.length > 20) ||
                        (data == "")
                )
    }
    fun insertIntoBank(){

        val name = binding.editTName.text.toString()
        val description = binding.editTDescription.text.toString()
        val owner = binding.editTOwner.text.toString()
        val data = binding.editTDat.text.toString()
        val status = binding.switchInProgress.isChecked
        val category = Category(chosenCategory, null, null)

        if (formValidator(name, description, owner, data)){
           // val tarefa = Task(0, name, description, owner, data, status, category)
               if(selectedTask == null){
                   val tarefa = Task(0, name , description , owner , data , status , category)

            mainViewModel.addTask(tarefa)

        }else{selectedTask != null
            val tarefa = Task(selectedTask?.id!! , name , description , owner , data , status , category)

                   mainViewModel.updateTask(tarefa)

               }
            Toast.makeText(context,"Task Saved", Toast.LENGTH_LONG).show()

            findNavController().navigate(R.id.action_formularyFrag_to_listFrag)
        }
    }

    override fun onTimeSelected(date: LocalDate) {
        mainViewModel.selectedData.value = date
    }

    private fun loadInfo(){

        selectedTask = mainViewModel.selectedTask
        if(selectedTask != null){
            binding.editTName.setText(selectedTask?.nome)
            binding.editTDescription.setText(selectedTask?.descricao)
            binding.editTOwner.setText(selectedTask?.responsavel)
            binding.editTDat.setText(selectedTask?.data)
            binding.switchInProgress.isChecked = selectedTask?.status!!
        }else{
            binding.editTName.text = null
            binding.editTDescription.text = null
            binding.editTOwner.text = null
            binding.editTDat.text = null
        }
    }

}