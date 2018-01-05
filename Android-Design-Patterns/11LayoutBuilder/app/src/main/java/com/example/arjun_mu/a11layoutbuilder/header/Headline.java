package com.example.arjun_mu.a11layoutbuilder.header;

import android.view.ViewGroup;

import com.example.arjun_mu.a11layoutbuilder.R;
import com.example.arjun_mu.a11layoutbuilder.layoutview.Header;

/**
 * Created by arjun_mu on 1/2/2018.
 */

public class Headline extends Header {
    @Override
    public ViewGroup.LayoutParams layoutParams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        return new ViewGroup.LayoutParams(width,height);    }

    @Override
    public int textSize() {
        return 24;
    }

    @Override
    public int content() {
        return R.string.headline;
    }

    @Override
    public int[] padding() {
        return new int[]{24,16,16,0};
    }
}
