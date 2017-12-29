package com.example.arjun_mu.a7bridgepattern;

import android.util.Log;

/**
 * Created by arjun_mu on 12/27/2017.
 */

public class Open implements SandwichInterface {

    private static final String TAG = "Open";
    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.d(TAG, "Open sandwich " + filling1 + filling2);
    }
}
