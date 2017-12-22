package com.example.arjun_mu.factorypattern.ConcreteClasses;

import com.example.arjun_mu.factorypattern.Bread;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Brioche implements Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String Calories() {
        return " : 85 kcal";
    }
}
