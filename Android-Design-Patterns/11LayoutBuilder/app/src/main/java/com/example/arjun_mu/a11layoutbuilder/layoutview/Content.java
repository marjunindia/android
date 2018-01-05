package com.example.arjun_mu.a11layoutbuilder.layoutview;

import com.example.arjun_mu.a11layoutbuilder.shading.ContentShading;
import com.example.arjun_mu.a11layoutbuilder.shading.Shading;

/**
 * Created by arjun_mu on 1/2/2018.
 */

public abstract class Content implements LayoutView {

    @Override
    public Shading shading() {
        return new ContentShading();
    }
}
