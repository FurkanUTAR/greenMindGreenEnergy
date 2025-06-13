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

        binding.hibritEnerjiSistemleriButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToHibritEnerjiSistemleriFragment()
            findNavController().navigate(action)
        }

        binding.surdurulebilirUlasimCozumleriButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToSurdurulebilirUlasimCozumleriFragment()
            findNavController().navigate(action)
        }

        binding.yenilenebilirEnerjiPolitikalariButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToYenilenebilirEnerjiPolitikalariFragment()
            findNavController().navigate(action)
        }

        binding.iklimDegisikligiVeEnerjiButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToIklimDegisikligiVeEnerjiFragment()
            findNavController().navigate(action)
        }

        binding.enerjiUretimindeRobotikUygulamalariButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToEnerjiUretimindeRobotikUygulamalariFragment()
            findNavController().navigate(action)
        }

        binding.enerjiVerimliligiIotKullanimiButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToEnerjiVerimliligindeIoTKullanimiFragment()
            findNavController().navigate(action)
        }

        binding.yesilCevreProjeleriButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToYesilCevreProjeleriFragment()
            findNavController().navigate(action)
        }

        binding.toplumsalSurdurulebilirlikBilinciButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToToplumsalSurdurulebilirlikBilinciFragment()
            findNavController().navigate(action)
        }

        binding.geleceginEnerjiTeknolojileriButton.setOnClickListener {
            val action = surdurulebilirEnerjiFragmentDirections.actionSurdurulebilirEnerjiFragmentToGeleceginEnerjiTeknolojileriFragment()
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}