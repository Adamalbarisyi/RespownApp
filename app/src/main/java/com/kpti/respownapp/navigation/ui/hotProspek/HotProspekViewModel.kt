package com.kpti.respownapp.navigation.ui.hotProspek

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HotProspekViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is hot prospek Fragment"
    }
    val text: LiveData<String> = _text
}