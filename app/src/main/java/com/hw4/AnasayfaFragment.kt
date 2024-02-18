package com.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hw4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding : FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.btnGoToA.setOnClickListener {
            directionMainPageToFragmentAFun(it)
        }
        binding.btnGoToX.setOnClickListener {
            directionMainPageToFragmentXFun(it)
        }

        return binding.root
    }

    private fun directionMainPageToFragmentAFun(view:View){
        Navigation.findNavController(view).navigate(AnasayfaFragmentDirections.pageADirection())
    }
    private fun directionMainPageToFragmentXFun(view:View){
        Navigation.findNavController(view).navigate(AnasayfaFragmentDirections.pageXDirection())
    }
}