package com.example.arjun_mu.a10datafactorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=(TextView) findViewById(R.id.textview);

        ArrayList<Cheese> cheeses = new ArrayList<>();
        cheeses.add(new Cheddar());
        cheeses.add(new Brie());

        for (Cheese cheese : cheeses) {
            cheese.getName();
            mTextView.append(cheese.getName());
        }


    }
}
