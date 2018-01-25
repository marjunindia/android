package com.example.arjun_mu.a14sandwichbuilderpattern.bread;

import com.example.arjun_mu.a14sandwichbuilderpattern.Ingredient;

/**
 * Created by arjun_mu on 1/18/2018.
 */

public abstract class Bread implements Ingredient {

    // later added all functions

    String decoration;
    int decorationKcal;

    public String getDecoration() {
        return decoration;
    }
    public int getDecorationKcal() {
        return decorationKcal;
    }

}
