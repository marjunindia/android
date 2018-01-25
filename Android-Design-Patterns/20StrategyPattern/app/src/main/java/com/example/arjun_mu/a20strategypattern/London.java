package com.example.arjun_mu.a20strategypattern;

/**
 * Created by arjun_mu on 1/25/2018.
 */

public class London implements Strategy {
    @Override
    public String reportWeather() {
        return "Constant drizzle";
    }
}
