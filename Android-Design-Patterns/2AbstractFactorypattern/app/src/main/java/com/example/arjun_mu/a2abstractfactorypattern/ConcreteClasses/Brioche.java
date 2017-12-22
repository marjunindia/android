package com.example.arjun_mu.a2abstractfactorypattern.ConcreteClasses;


import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Bread;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Brioche implements Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return " : 85 kcal";
    }
}
