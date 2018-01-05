package com.example.arjun_mu.a10datafactorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    /*
        In this section, we will apply a factory pattern to create objects of type cheese. This will in
    turn implement a filling interface. Each object will consist of several properties such as price
    and calorific value. Some of these values will be presented in our list items and others will
    be available only through an expanded view or accessible only via code.
    One of the few disadvantages of design patterns is the large number of classes that soon
    accumulate. For this reason, before beginning the following exercise, create a new package
    inside the java directory, called fillings.
     */

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
