package com.alvarado.repasoparcial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.alvarado.repasoparcial.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    val args: SecondFragmentArgs by navArgs()//ejemplo
    private val viewModel : MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding.greetingTextView.text = getString(R.string.greeting_text,args.name)
        //args.name
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        val navController = findNavController()
        binding.actionContinue.setOnClickListener{
            val action = SecondFragmentDirections.actionSecondFragmentToResultFragment()
            navController.navigate(action)
        }
    }

}