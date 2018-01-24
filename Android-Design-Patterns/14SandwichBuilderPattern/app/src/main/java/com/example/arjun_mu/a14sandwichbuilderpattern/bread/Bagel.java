package com.example.arjun_mu.a14sandwichbuilderpattern.bread;

import com.example.arjun_mu.a14sandwichbuilderpattern.bread.Bread;

/**
 * Created by arjun_mu on 1/18/2018.
 */

public class Bagel extends Bread {
    @Override
    public String description() {
        return "Bagel";
    }

    @Override
    public int kcal() {
        return 250;
    }
}
