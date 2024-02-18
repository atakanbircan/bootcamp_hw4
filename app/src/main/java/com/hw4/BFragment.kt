package com.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hw4.databinding.FragmentBBinding

class BFragment : Fragment() {
    private lateinit var binding : FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)

        binding.btnGoToY.setOnClickListener {
            directionPageBToPageY(it)
        }

        return binding.root
    }
    private fun directionPageBToPageY(view:View){
        Navigation.findNavController(view).navigate(BFragmentDirections.PageYDirection())
    }
}