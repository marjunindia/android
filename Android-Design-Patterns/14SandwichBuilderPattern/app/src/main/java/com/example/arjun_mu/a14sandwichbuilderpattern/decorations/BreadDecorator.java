package com.example.arjun_mu.a14sandwichbuilderpattern.decorations;


import com.example.arjun_mu.a14sandwichbuilderpattern.bread.Bread;

/**
 * Created by kyle on 24/07/2016.
 */
public abstract class BreadDecorator extends Bread {

    public abstract String getDecoration();

    public abstract int getDecorationKcal();
}
