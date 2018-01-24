package com.example.arjun_mu.a13decoratorpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.arjun_mu.a13decoratorpattern.Bread.Bagel;
import com.example.arjun_mu.a13decoratorpattern.Bread.Bread;
import com.example.arjun_mu.a13decoratorpattern.BreadDecorator.LowFatSpread;
import com.example.arjun_mu.a13decoratorpattern.BreadDecorator.Open;
import com.example.arjun_mu.a13decoratorpattern.BreadDecorator.Toasted;
import com.example.arjun_mu.a13decoratorpattern.Filling.Filling;
import com.example.arjun_mu.a13decoratorpattern.Filling.Lettuce;
import com.example.arjun_mu.a13decoratorpattern.FillingDecorator.DoublePortion;

public class MainActivity extends AppCompatActivity{
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bread bagel=new Bagel();

        LowFatSpread spread=new LowFatSpread(bagel);
        Toasted toast=new Toasted(spread);
        Open open=new Open(toast);


        Log.d(TAG, spread.getDescription() + " " + spread.getKcal());
        Log.d(TAG, toast.getDescription() + " " + toast.getKcal());
        Log.d(TAG, open.getDescription() + " " + open.getKcal());

        Filling lettuce=new Lettuce();

        DoublePortion doublePortion=new DoublePortion(lettuce);

        Log.d(TAG, doublePortion.getDescription() + " " + doublePortion.getKcal());

    }
}
