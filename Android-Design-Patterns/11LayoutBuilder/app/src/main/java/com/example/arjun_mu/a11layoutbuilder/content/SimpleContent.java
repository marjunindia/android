package com.example.arjun_mu.a11layoutbuilder.content;

import android.view.ViewGroup;

import com.example.arjun_mu.a11layoutbuilder.R;
import com.example.arjun_mu.a11layoutbuilder.layoutview.Content;

/**
 * Created by arjun_mu on 1/2/2018.
 */

public class SimpleContent extends Content {
    @Override
    public ViewGroup.LayoutParams layoutParams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.MATCH_PARENT;
        return new ViewGroup.LayoutParams(width, height);
    }

    @Override
    public int textSize() {
        return 14;
    }

    @Override
    public int content() {
        return R.string.simplecontent;
    }

    @Override
    public int[] padding() {
        return new int[]{16,18,16,16};
    }
}
