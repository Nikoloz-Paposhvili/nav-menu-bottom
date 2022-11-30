package com.example.navmenu.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navmenu.R

class SettingsFragment : Fragment(R.layout.fragment_settings) {
    private lateinit var dashboard : TextView
    private lateinit var home : TextView
    private lateinit var notification : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dashboard = view.findViewById(R.id.textView7)
        home = view.findViewById(R.id.textView4)
        notification = view.findViewById(R.id.textView3)

        dashboard.setOnClickListener{

            val action = SettingsFragmentDirections.actionSettingsFragmentToDashboardFragment().apply {
            }
            findNavController().navigate(action)
        }
        home.setOnClickListener{

            val action = SettingsFragmentDirections.actionSettingsFragmentToHomeFragment().apply {
            }
            findNavController().navigate(action)
        }
        notification.setOnClickListener{

            val action = SettingsFragmentDirections.actionSettingsFragmentToNotificationFragment().apply {
            }
            findNavController().navigate(action)
        }
    }

}
