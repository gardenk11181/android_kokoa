package com.gardenlab.androidkokoa;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment4 extends Fragment {
    final String TAG = "WEATHER";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.fragment4,container,false);

        WeatherHttpClient httpClient = new WeatherHttpClient();
        String data = httpClient.getWeatherData("Seoul");
        Log.d(TAG, "Weather Data: "+data);

        return rootView;
    }
}
