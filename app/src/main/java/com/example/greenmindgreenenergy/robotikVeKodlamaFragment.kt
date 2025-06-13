package com.example.greenmindgreenenergy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.greenmindgreenenergy.databinding.FragmentRobotikVeKodlamaBinding
import com.example.greenmindgreenenergy.databinding.FragmentSurdurulebilirEnerjiBinding

class robotikVeKodlamaFragment : Fragment() {

    private var _binding: FragmentRobotikVeKodlamaBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRobotikVeKodlamaBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.robotikKodlamayaGirisButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToRobotikKodlamayaGirisFragment()
            findNavController().navigate(action)
        }

        binding.mikrodenetleyiciyeGirisButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToMikrodenetleyiciyeGirisFragment()
            findNavController().navigate(action)
        }

        binding.elektronikBilesenlerVeSensorlerButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToElektronikBilesenlerVeSensorlerFragment()
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}