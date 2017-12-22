package com.example.arjun_mu.a3builderpattern.AbstractClass;

import com.example.arjun_mu.a3builderpattern.Ingredient;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public abstract class Filling implements Ingredient {

    @Override
    public abstract String name();

    @Override
    public abstract int calories();
}
