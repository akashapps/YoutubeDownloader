package com.akash.youtubedownloader.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.akash.youtubedownloader.R

class BrowseFragment : Fragment() {

    private lateinit var browseViewModel: BrowseViewModel
    private lateinit var webView: WebView;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        browseViewModel = ViewModelProvider(this).get(BrowseViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_browse, container, false)

        webView = root.findViewById(R.id.web_view)
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()

        loadYouTube();

        return root
    }

    private fun loadYouTube() {
        browseViewModel.url.value?.let { webView.loadUrl(it) }
    }
}