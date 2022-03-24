package com.example.to_do_listv3_retrofit_rest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.to_do_listv3_retrofit_rest.databinding.FragmentFormularyBinding

class FormularyFrag : Fragment() {

    private lateinit var binding: FragmentFormularyBinding
    //Declarando uma instancia de ViewModel Compartilhada: (by activityViewModels())
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormularyBinding.inflate(layoutInflater,container, false)

        binding.buttonSave.setOnClickListener {
            findNavController().navigate(R.id.action_formularyFrag_to_listFrag)
        }
        return binding.root
    }

}