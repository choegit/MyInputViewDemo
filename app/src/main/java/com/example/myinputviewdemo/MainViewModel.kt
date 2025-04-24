package com.example.myinputviewdemo

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State

class MainViewModel : ViewModel() {
    private val _inputText = mutableStateOf("")
    val inputText: State<String> = _inputText

    fun onTextChanged(newText: String) {
        _inputText.value = newText

    }

}