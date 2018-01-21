package com.example.arjun27.a1fragment;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by arjun27 on 1/21/2018.
 */

public class Screenutility {

    float dpWidth;
    float dpHeight;


    public Screenutility(Activity activity) {
        Display display=activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics=new DisplayMetrics() ;
        display.getMetrics(displayMetrics);

        float density=activity.getResources().getDisplayMetrics().density;
        dpWidth=displayMetrics.widthPixels/density;
        dpHeight=displayMetrics.heightPixels/density;
    }

    public float getDpWidth() {
        return dpWidth;
    }

    public float getDpHeight() {
        return dpHeight;
    }

}
