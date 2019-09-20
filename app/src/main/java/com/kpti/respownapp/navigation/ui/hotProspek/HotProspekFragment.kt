package com.kpti.respownapp.navigation.ui.hotProspek

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.kpti.respownapp.R

class HotProspekFragment : Fragment() {

    private lateinit var hotProspekViewModel: HotProspekViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        hotProspekViewModel =
            ViewModelProviders.of(this).get(HotProspekViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_hot_prospek, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        hotProspekViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}