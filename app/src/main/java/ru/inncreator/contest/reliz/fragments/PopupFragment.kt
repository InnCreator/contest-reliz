package ru.inncreator.contest.reliz.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import ru.inncreator.contest.reliz.R

class PopupFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView: View = inflater.inflate(R.layout.fragment_popup, container, false)

        dialog?.window?.setBackgroundDrawableResource(R.drawable.round_background)
        dialog?.window?.attributes?.windowAnimations = R.style.DialogAnimation

        return rootView
    }

}