package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
         String mForecast;
        TextView mWeatherDisplay = (TextView) findViewById(R.id.tv_display_weather);
        Intent in = getIntent();
        if(in !=null)
        {
            if(in.hasExtra(Intent.EXTRA_TEXT)){
                mForecast = in.getStringExtra(Intent.EXTRA_TEXT);
                mWeatherDisplay.setText(mForecast);
            }
        }

        // TODO (2) Display the weather forecast that was passed from MainActivity
    }
}