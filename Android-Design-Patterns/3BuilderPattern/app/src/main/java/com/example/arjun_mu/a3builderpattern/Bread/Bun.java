package com.example.arjun_mu.a3builderpattern.Bread;

import com.example.arjun_mu.a3builderpattern.AbstractClass.Bread;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Bun extends Bread {
    @Override
    public String name() {
        return "Bun";
    }

    @Override
    public int calories() {
        return 500;
    }
}
