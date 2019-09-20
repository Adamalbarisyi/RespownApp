package com.kpti.respownapp.navigation.ui.dataRespown

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataRespownViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Data Respown Fragment"
    }
    val text: LiveData<String> = _text
}