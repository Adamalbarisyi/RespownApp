package com.kpti.respownapp.navigation.ui.jadwal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JadwalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is jadwal Fragment"
    }
    val text: LiveData<String> = _text
}