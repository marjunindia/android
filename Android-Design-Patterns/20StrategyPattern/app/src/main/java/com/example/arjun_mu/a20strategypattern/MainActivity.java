package com.example.arjun_mu.a20strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Location context;
        String location = "London";
        switch (location) {
            case "London":
                context = new Location(new London());
                break;
            case "Glasgow":
                context = new Location(new Glasgow());
                break;
            default:
                context = new Location(new Paris());
                break;
        }
        context.executeStrategy(this);

    }
}
