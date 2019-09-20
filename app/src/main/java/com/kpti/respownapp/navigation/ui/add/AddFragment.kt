package com.kpti.respownapp.navigation.ui.add

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.kpti.respownapp.R
import kotlinx.android.synthetic.main.fragment_add.*
import java.text.SimpleDateFormat
import java.util.*

class AddFragment : Fragment() {

    private lateinit var addViewModel: AddViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addViewModel =
            ViewModelProviders.of(this).get(AddViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        addViewModel.text.observe(this, Observer {
//            textView.text = it
//        })
        val mPickTimeBtn = root.findViewById<Button>(R.id.button_date_1)
        val textView     = root.findViewById<TextView>(R.id.tvDate)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        mPickTimeBtn.setOnClickListener {

            val dpd =
                context?.let { it1 ->
                    DatePickerDialog(it1, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                        // Display Selected date in TextView
                        textView.setText("" + dayOfMonth + " " + month + ", " + year)
                    }, year, month, day)
                }
            if (dpd != null) {
                dpd.show()
            }

        }

        return root

    }
}

