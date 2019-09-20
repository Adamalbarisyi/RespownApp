package com.kpti.respownapp.navigation.ui.jadwal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.kpti.respownapp.R

class JadwalFragment : Fragment() {

    private lateinit var jadwalViewModel: JadwalViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        jadwalViewModel =
            ViewModelProviders.of(this).get(JadwalViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_jadwal, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        jadwalViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}