package com.example.arjun_mu.a2abstractfactorypattern.ConcreteClasses;

import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Filling;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Tomato implements Filling {
    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String calories() {
        return "350cal";
    }
}
