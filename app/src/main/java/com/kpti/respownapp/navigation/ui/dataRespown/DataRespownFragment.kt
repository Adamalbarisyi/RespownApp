package com.kpti.respownapp.navigation.ui.dataRespown

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.kpti.respownapp.R

class DataRespownFragment : Fragment() {

    private lateinit var dataRespownViewModel: DataRespownViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataRespownViewModel =
            ViewModelProviders.of(this).get(DataRespownViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_data_respown, container, false)
        val textView: TextView = root.findViewById(R.id.text_tools)
        dataRespownViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}