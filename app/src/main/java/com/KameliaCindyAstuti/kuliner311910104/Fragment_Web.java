package com.KameliaCindyAstuti.kuliner311910104;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Fragment_Web extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment__web, container, false);
        WebView myWebView = myView.findViewById(R.id.web_view);

        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.kulinerasyik.com/category/resep-asyik/");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        // Inflate the layout for this fragment
        return myView;
    }
}