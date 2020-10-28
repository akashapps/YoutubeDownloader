package com.akash.youtubedownloader.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _url = MutableLiveData<String>().apply {
        value = "https://m.youtube.com/"
    }
    val url: LiveData<String> = _url
}