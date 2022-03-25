package com.example.to_do_listv3_retrofit_rest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.to_do_listv3_retrofit_rest.Adapter.TaskAdapter
import com.example.to_do_listv3_retrofit_rest.databinding.FragmentListBinding
class ListFrag : Fragment() {

    private lateinit var binding: FragmentListBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        mainViewModel.listCategory()

        val adapter = TaskAdapter()

        binding.recyclerTaskV.layoutManager = LinearLayoutManager(context)
        binding.recyclerTaskV.adapter = adapter
        binding.recyclerTaskV.setHasFixedSize(true)
        binding.floatAButton.setOnClickListener{
            findNavController().navigate(R.id.action_listFrag_to_formularyFrag)
        }
        return binding.root
    }

}