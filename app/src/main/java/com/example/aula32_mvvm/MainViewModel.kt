package com.example.aula32_mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val soma = MutableLiveData<Int>().apply {
        value = 0
    }

    //metodo de incremento
    fun incremento(num: Int) {
        soma.value.let {
            soma.value = it!! + num
        }
    }
    fun refresh(){
        soma.value = 0
    }
}