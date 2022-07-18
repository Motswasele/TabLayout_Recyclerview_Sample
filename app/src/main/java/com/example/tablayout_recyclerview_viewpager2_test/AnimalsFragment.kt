package com.example.tablayout_recyclerview_viewpager2_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout_recyclerview_viewpager2_test.databinding.FragmentAnimalsBinding

class AnimalsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private var binding: FragmentAnimalsBinding? = null
    private var adapter: MyAnimalsAdapter?= null

    lateinit var title: Array<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentAnimalsBinding.inflate(layoutInflater)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAnimalsAdapter()
        recyclerView.adapter = adapter

    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}