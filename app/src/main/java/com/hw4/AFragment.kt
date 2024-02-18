package com.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hw4.databinding.FragmentABinding

class AFragment : Fragment() {
    private lateinit var binding:FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)

        binding.btnGoToB.setOnClickListener {
            directionPageAToPageB(it)
        }
        return  binding.root
    }

    private fun directionPageAToPageB(view:View){
        Navigation.findNavController(view).navigate(AFragmentDirections.pageBDirection())
    }
}