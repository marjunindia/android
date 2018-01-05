package com.example.arjun_mu.a11layoutbuilder.shading;

import com.example.arjun_mu.a11layoutbuilder.R;

/**
 * Created by arjun_mu on 1/2/2018.
 */

public class ContentShading implements Shading {
    @Override
    public int shade() {
        return R.color.colorAccent;
    }

    @Override
    public int background() {
        return R.color.colorPrimary;
    }
}
