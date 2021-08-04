package com.lucasesteves.catalagocervejas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lucasesteves.catalagocervejas.databinding.FragmentCervejasBinding


class CervejasFragment : Fragment() {
    private var binding: FragmentCervejasBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCervejasBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
