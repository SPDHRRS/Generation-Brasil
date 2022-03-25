package com.example.to_do_listv3_retrofit_rest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.to_do_listv3_retrofit_rest.Model.Category
import com.example.to_do_listv3_retrofit_rest.databinding.FragmentFormularyBinding
import com.example.to_do_listv3_retrofit_rest.fragments.DatePickerFragment
import com.example.to_do_listv3_retrofit_rest.fragments.TimePickerListener
import java.time.LocalDate

class FormularyFrag : Fragment() , TimePickerListener{

    private lateinit var binding: FragmentFormularyBinding
    //Declarando uma instancia de ViewModel Compartilhada: (by activityViewModels())
    private val mainViewModel: MainViewModel by activityViewModels()

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
        binding.buttonSave.setOnClickListener {
            findNavController().navigate(R.id.action_formularyFrag_to_listFrag)
        }
        binding.editTDat.setOnClickListener {
            DatePickerFragment(this).show(parentFragmentManager, "DatePicker")
        }
        return binding.root
    }
    fun spinnerCategory(categories: List<Category>?){

        if(categories != null){
            binding.spinnerCategory.adapter = ArrayAdapter(
                requireContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                categories
            )
        }
    }
    override fun onTimeSelected(date: LocalDate) {
        mainViewModel.selectedData.value = date
    }

}