package com.example.arjun_mu.a20strategypattern;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

/**
 * Created by arjun_mu on 1/25/2018.
 */

public class Location {
    // create the context class, which here is the location

    private Strategy mStrategy;

    public Location(Strategy strategy) {
        mStrategy = strategy;
    }
    public void executeStrategy(Context context) {
        TextView textView=(TextView)
                ((Activity)context)
                        .findViewById(R.id.textvi);
        textView.setText(mStrategy.reportWeather());
    }
}
