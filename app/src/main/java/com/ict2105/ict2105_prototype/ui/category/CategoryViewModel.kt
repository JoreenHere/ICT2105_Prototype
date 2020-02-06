package com.ict2105.ict2105_prototype.ui.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CategoryViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragmentsssssss"
    }
    private val _text1 = MutableLiveData<String>().apply {
        value = "BOOKS"
    }
    val text: LiveData<String> = _text

}
