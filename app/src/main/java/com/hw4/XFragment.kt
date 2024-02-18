package com.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hw4.databinding.FragmentXBinding

class XFragment : Fragment() {
    private lateinit var binding : FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentXBinding.inflate(inflater,container,false)

        binding.btnGoToY2.setOnClickListener {
            directionFragmentXToFragmentYFun(it)
        }
        return binding.root
    }

    private fun directionFragmentXToFragmentYFun(view:View){
        Navigation.findNavController(view).navigate(XFragmentDirections.pageXtoYDireciton())
    }
}