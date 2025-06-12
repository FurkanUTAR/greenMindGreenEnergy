package com.example.greenmindgreenenergy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.greenmindgreenenergy.databinding.FragmentGirisSayfaBinding
import com.example.greenmindgreenenergy.databinding.FragmentSurdurulebilirEnerjiBinding

class surdurulebilirEnerjiFragment : Fragment() {

    private var _binding: FragmentSurdurulebilirEnerjiBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSurdurulebilirEnerjiBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.surdurulebilirEnerjiyeGirisButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToSurdurulebilirEnerjiGirisFragment()
            findNavController().navigate(action)
        }

        binding.yesilEnerjiKaynaklariButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToYesilEnerjiKaynaklariFragment()
            findNavController().navigate(action)
        }

        binding.fosilYakitlarinEtkileriButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToFosilYakitlarinEtkileriFragment()
            findNavController().navigate(action)
        }

        binding.enerjiVerimliligiTeknikleriButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToEnerjiVerimliligiTeknikleriFragment()
            findNavController().navigate(action)
        }

        binding.gunesPanelleriTeknolojisiButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToGunesPanelleriTeknolojisi()
            findNavController().navigate(action)
        }

        binding.ruzgarTurbinleriVeCalismaPrensipleriButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToRuzgarTurbinleriVeCalismaPrensipleriFragment()
            findNavController().navigate(action)
        }

        binding.hidroelektrikEnerjiVeBarajlarButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToHidroelektrikEnerjiVeBarajlarFragment()
            findNavController().navigate(action)
        }

        binding.yesilBinalarVeEnerjiYNetimiButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToYesilBinalarVeEnerjiYonetimiFragment()
            findNavController().navigate(action)
        }

        binding.karbonAyakIziHesaplamaButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToKarbonAyakIziHesaplamaFragment()
            findNavController().navigate(action)
        }

        binding.enerjiDepolamaSistemleriButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToEnerjiDepolamaSistemleriFragment()
            findNavController().navigate(action)
        }

        binding.akilliSebekeSistemleriButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToAkilliSebekeSistemleriFragment()
            findNavController().navigate(action)
        }
    }

}