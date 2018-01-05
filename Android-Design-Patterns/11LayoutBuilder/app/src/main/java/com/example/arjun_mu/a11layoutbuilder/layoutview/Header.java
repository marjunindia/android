package com.example.arjun_mu.a11layoutbuilder.layoutview;

import com.example.arjun_mu.a11layoutbuilder.shading.HeaderShading;
import com.example.arjun_mu.a11layoutbuilder.shading.Shading;

/**
 * Created by arjun_mu on 1/2/2018.
 */

public abstract class Header implements LayoutView {


    @Override
    public Shading shading() {
        return new HeaderShading();
    }
}
