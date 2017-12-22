package com.example.arjun_mu.factorypattern.ConcreteClasses;


import com.example.arjun_mu.factorypattern.Bread;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Roll implements Bread {

    @Override
    public String name() {
        return "Roll";
    }

    @Override
    public String Calories() {
        return " : 75 kcal";
    }
}
