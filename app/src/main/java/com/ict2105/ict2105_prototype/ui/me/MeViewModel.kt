package com.ict2105.ict2105_prototype.ui.me

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ict2105.ict2105_prototype.R

class MeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text

    private val _text1 = MutableLiveData<String>().apply {
        value = "UserName"
    }
    val text1: LiveData<String> = _text1

    private val _text2 = MutableLiveData<String>().apply {
        value = "THIS IS DESCRIPTION"
    }
    val text2: LiveData<String> = _text2

}