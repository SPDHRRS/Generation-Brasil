package com.example.to_do_listv3_retrofit_rest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.to_do_listv3_retrofit_rest.Adapter.TaskAdapter
import com.example.to_do_listv3_retrofit_rest.Adapter.TaskItemClickListener
import com.example.to_do_listv3_retrofit_rest.Model.Task
import com.example.to_do_listv3_retrofit_rest.databinding.FragmentListBinding
class ListFrag : Fragment() , TaskItemClickListener{

    private lateinit var binding: FragmentListBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        mainViewModel.listCategory()

        mainViewModel.listTask()

        val adapter = TaskAdapter(this, mainViewModel)

        binding.recyclerTaskV.layoutManager = LinearLayoutManager(context)
        binding.recyclerTaskV.adapter = adapter
        binding.recyclerTaskV.setHasFixedSize(true)
        binding.floatAButton.setOnClickListener{
            findNavController().navigate(R.id.action_listFrag_to_formularyFrag)
        }

        mainViewModel.myTaskResponse.observe(viewLifecycleOwner, {response -> if(response != null)
        {adapter.setList(response.body()!!) }
        })

        return binding.root
    }

    override fun onTaskClicked(tarefa: Task) {
        mainViewModel.selectedTask = tarefa
        findNavController().navigate(R.id.action_listFrag_to_formularyFrag)
    }

}