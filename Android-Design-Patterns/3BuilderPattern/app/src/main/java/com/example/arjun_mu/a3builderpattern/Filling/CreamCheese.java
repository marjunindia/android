package com.example.arjun_mu.a3builderpattern.Filling;

import com.example.arjun_mu.a3builderpattern.AbstractClass.Filling;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class CreamCheese extends Filling{

    @Override
    public String name() {
        return "CreamCheese";
    }

    @Override
    public int calories() {
        return 250;
    }
}
