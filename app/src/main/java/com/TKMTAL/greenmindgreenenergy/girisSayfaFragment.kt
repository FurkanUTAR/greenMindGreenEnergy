package com.TKMTAL.greenmindgreenenergy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.TKMTAL.greenmindgreenenergy.databinding.FragmentGirisSayfaBinding

class girisSayfaFragment : Fragment() {

    private var _binding: FragmentGirisSayfaBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGirisSayfaBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.anaSayfaButton.setOnClickListener {
            val action = girisSayfaFragmentDirections.actionGirisSayfaFragmentToAnaSayfaFragment()
            findNavController().navigate(action)
        }

        binding.projeHakkindaButton.setOnClickListener{
            val action = girisSayfaFragmentDirections.actionGirisSayfaFragmentToHakkimizdaSayfaFragment()
            findNavController().navigate(action)
        }

        binding.surdurulebilirEnerjiButton.setOnClickListener{
            val action = girisSayfaFragmentDirections.actionGirisSayfaFragmentToSurdurulebilirEnerjiFragment()
            findNavController().navigate(action)
        }

        binding.aktivitelerButton.setOnClickListener{

        }

        binding.robotikVeKodlamaButton.setOnClickListener{
            val action = girisSayfaFragmentDirections.actionGirisSayfaFragmentToRobotikVeKodlamaFragment()
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}