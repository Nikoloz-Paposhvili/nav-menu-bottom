package com.example.navmenu.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.app.Person.fromBundle
import androidx.fragment.app.Fragment
import com.example.navmenu.R

class NotificationFragment:Fragment(R.layout.fragment_notification) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text = NotificationFragmentArgs.fromBundle(requireArguments()).name1
    }
}