package ru.inncreator.contest.reliz.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.delay
import ru.inncreator.contest.reliz.R


class MenuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView: View = inflater.inflate(R.layout.fragment_menu, container, false)

        rootView.findViewById<MaterialButton>(R.id.screen1).setOnClickListener {
            findNavController().navigate(MenuFragmentDirections.actionMenuFragmentToScreen1Fragment())
        }
        rootView.findViewById<MaterialButton>(R.id.screen1_popup).setOnClickListener {
            val newFragment = PopupFragment()
            newFragment.show(
                requireActivity().supportFragmentManager,
                PopupFragment::class.simpleName
            )
        }
        return rootView
    }
}