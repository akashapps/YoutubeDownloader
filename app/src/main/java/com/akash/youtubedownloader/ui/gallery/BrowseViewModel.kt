package com.akash.youtubedownloader.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BrowseViewModel : ViewModel() {

    private val _url = MutableLiveData<String>().apply {
        value = "https://m.youtube.com/"
    }
    val url: LiveData<String> = _url
}