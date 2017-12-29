package com.example.arjun_mu.a7bridgepattern;

import android.util.Log;

/**
 * Created by arjun_mu on 12/27/2017.
 */

public class Closed implements SandwichInterface {
    private static final String TAG ="Closed" ;

    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.d(TAG, "Closed sandwich " + filling1 + filling2);


    }
}
