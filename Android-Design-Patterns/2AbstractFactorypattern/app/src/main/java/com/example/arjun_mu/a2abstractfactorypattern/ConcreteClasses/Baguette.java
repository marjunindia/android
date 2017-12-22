package com.example.arjun_mu.a2abstractfactorypattern.ConcreteClasses;


import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Bread;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Baguette implements Bread {

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return null;
    }


}
