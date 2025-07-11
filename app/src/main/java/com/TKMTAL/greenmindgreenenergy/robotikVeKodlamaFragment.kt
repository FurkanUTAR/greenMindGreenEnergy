package com.TKMTAL.greenmindgreenenergy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.TKMTAL.greenmindgreenenergy.databinding.FragmentRobotikVeKodlamaBinding

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

        binding.arduinoIleKodlamaButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToArduinoileKodlamaFragment()
            findNavController().navigate(action)
        }

        binding.motorKontrolSistemleriButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToMotorKontrolSistemleriFragment()
            findNavController().navigate(action)
        }

        binding.sensorEntegrasyonuButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToSensorEntegrasyonuFragment()
            findNavController().navigate(action)
        }

        binding.algoritmaGelistirmeButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToAlgoritmaGelistirmeFragment()
            findNavController().navigate(action)
        }

        binding.mobilRobotikSistemlerButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToMobilRobotikSistemlerFragment()
            findNavController().navigate(action)
        }

        binding.otonomAraclarIcinAlgoritmalarButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToOtonomAraclarIcinAlgoritmaFragment()
            findNavController().navigate(action)
        }

        binding.veriToplamaVeAnaliziButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToVeriToplamaVeAnaliziFragment()
            findNavController().navigate(action)
        }

        binding.yapayZekaTabanliRobotikButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToYapayZekaTabanliRobotikFragment()
            findNavController().navigate(action)
        }

        binding.endustriyelRobotikUygulamalariButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToEndustriyelRobotikUygulamalariFragment()
            findNavController().navigate(action)
        }

        binding.rosIleCalismaButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToRosileCalismakFragment()
            findNavController().navigate(action)
        }

        binding.goruntuIslemeveRobotikButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToGoruntuIslemeVeRobotikFragment()
            findNavController().navigate(action)
        }

        binding.robotikSistemlerinOptimizasyonuButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToRobotikSistemlerinOptimizasyonuFragment()
            findNavController().navigate(action)
        }

        binding.robotikKollarinTasarimiVeKontroluButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToRobotKollarininTasarimiVeKontroluFragment()
            findNavController().navigate(action)
        }

        binding.robotlarIcinIoTEntegrasyonuButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToRobotlarIcinIotEntegrasyonu()
            findNavController().navigate(action)
        }

        binding.suruHalindeCalisanRobotikSistemlerButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToSuruHalindeCalisanRobotikSistemlerFragment()
            findNavController().navigate(action)
        }

        binding.hibritRobotikSistemlerButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToHibritRobotikSistemlerFragment()
            findNavController().navigate(action)
        }

        binding.geleceginRobotikTeknolojileriButton.setOnClickListener {
            val action = robotikVeKodlamaFragmentDirections.actionRobotikVeKodlamaFragmentToGeleceginRobotikTeknolojileriFragment()
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}