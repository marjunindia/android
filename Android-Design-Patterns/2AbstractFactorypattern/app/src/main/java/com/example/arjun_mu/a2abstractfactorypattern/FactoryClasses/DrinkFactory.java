package com.example.arjun_mu.a2abstractfactorypattern.FactoryClasses;

import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Bread;
import com.example.arjun_mu.a2abstractfactorypattern.ConcreteClasses.IcedTea;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Drink;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Filling;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class DrinkFactory extends AbstractFactory {

    @Override
    public Bread getBread(String bread) {
        return null;
    }

    @Override
    public Filling getFiling(String filling) {
        return null;
    }

    @Override
    public Drink getDrink(String drinkType) {

        if (drinkType == null) {
            return null;
        }
        if (drinkType == "FANTA") {
            return new IcedTea();
        }

        return null;
    }
}
