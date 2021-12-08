package ru.inncreator.contest.reliz.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton
import ru.inncreator.contest.reliz.R

class Screen1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView: View = inflater.inflate(R.layout.fragment_screen1, container, false)

        val toolbar: MaterialToolbar = rootView.findViewById(R.id.toolbar)
        (requireActivity() as AppCompatActivity).apply {
            setSupportActionBar(toolbar)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            setHasOptionsMenu(true)
        }

        rootView.findViewById<MaterialButton>(R.id.btn1).setOnClickListener {
            findNavController().navigate(Screen1FragmentDirections.actionScreen1FragmentToScreen2Fragment())
        }
        rootView.findViewById<MaterialButton>(R.id.screen1).setOnClickListener {
            findNavController().navigate(Screen1FragmentDirections.actionScreen1FragmentToScreen3Fragment())
        }
        rootView.findViewById<MaterialButton>(R.id.btn3).setOnClickListener {
            findNavController().navigate(Screen1FragmentDirections.actionScreen1FragmentToScreen4Fragment())
        }

        return rootView
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                requireActivity().onBackPressed()
                return true
            }
        }
        return false
    }


}