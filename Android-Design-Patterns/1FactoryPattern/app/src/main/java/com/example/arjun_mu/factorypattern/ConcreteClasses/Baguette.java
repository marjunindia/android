package com.example.arjun_mu.factorypattern.ConcreteClasses;

import com.example.arjun_mu.factorypattern.Bread;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Baguette implements Bread {

    // Create concrete classes of Bread,

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String Calories() {
        return " : 65 kcal" ;
    }
}
