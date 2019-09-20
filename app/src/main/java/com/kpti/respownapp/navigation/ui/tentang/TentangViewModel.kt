package com.kpti.respownapp.navigation.ui.tentang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TentangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is tentang Fragment"
    }
    val text: LiveData<String> = _text
}