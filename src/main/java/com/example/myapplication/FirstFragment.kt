package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set click listener for the button
        binding.button.setOnClickListener {
            // Handle button click event here
            // For example, change the layout to a new layout
            changeLayout()
        }
    }

    private fun changeLayout() {
        // Inflate the new layout
        val newLayout = LayoutInflater.from(requireContext()).inflate(R.layout.new_task, null)

        // Replace the current layout with the new layout
        binding.root.removeAllViews()
        binding.root.addView(newLayout)

        // Implement any other logic related to the new layout
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
