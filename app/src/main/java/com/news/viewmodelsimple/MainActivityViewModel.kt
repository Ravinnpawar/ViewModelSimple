package com.news.viewmodelsimple

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingCount:Int) : ViewModel() {
    var number = startingCount

    fun getUpdateCount(): Int {
        return  ++number
    }

    fun getCurrentCount(): Int {
        return number
    }

}