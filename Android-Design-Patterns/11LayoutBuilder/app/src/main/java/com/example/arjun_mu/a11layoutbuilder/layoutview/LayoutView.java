package com.example.arjun_mu.a11layoutbuilder.layoutview;

import android.view.ViewGroup;

import com.example.arjun_mu.a11layoutbuilder.shading.Shading;

/**
 * Created by arjun_mu on 1/2/2018.
 */

public interface LayoutView {

    // Create the following interface for our view classes:

    ViewGroup.LayoutParams layoutParams();
    int textSize();
    int content();
    Shading shading();
    int[] padding();
}
