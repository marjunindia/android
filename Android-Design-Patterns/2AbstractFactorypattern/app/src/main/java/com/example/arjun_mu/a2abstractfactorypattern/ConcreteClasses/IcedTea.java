package com.example.arjun_mu.a2abstractfactorypattern.ConcreteClasses;

import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Drink;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class IcedTea implements Drink {
    @Override
    public String name() {
        return "Iced tea";
    }

    @Override
    public String calories() {
        return " : 110 kcal";
    }
}
