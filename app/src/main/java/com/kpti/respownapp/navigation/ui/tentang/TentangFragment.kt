package com.kpti.respownapp.navigation.ui.tentang

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.kpti.respownapp.R

class TentangFragment : Fragment() {

    private lateinit var tentangViewModel: TentangViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tentangViewModel =
            ViewModelProviders.of(this).get(TentangViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tentang, container, false)
//        val textView: TextView = root.findViewById(R.id.text_share)
//        tentangViewModel.text.observe(this, Observer {
//            textView.text = it
//        })
        return root
    }
}