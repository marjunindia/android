package com.example.arjun_mu.a11layoutbuilder.header;

import android.view.ViewGroup;

import com.example.arjun_mu.a11layoutbuilder.layoutview.Header;

/**
 * Created by arjun_mu on 1/2/2018.
 */

public class SubHeadline extends Header {
    @Override
    public ViewGroup.LayoutParams layoutParams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        return new ViewGroup.LayoutParams(width,height);
    }

    @Override
    public int textSize() {
        return 18;
    }

    @Override
    public int content() {
        return 0;
    }

    @Override
    public int[] padding() {
        return new int[0];
    }
}
