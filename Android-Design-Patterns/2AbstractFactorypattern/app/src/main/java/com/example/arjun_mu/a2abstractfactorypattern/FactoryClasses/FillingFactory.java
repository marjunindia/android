package com.example.arjun_mu.a2abstractfactorypattern.FactoryClasses;

import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Bread;
import com.example.arjun_mu.a2abstractfactorypattern.ConcreteClasses.Cheese;
import com.example.arjun_mu.a2abstractfactorypattern.ConcreteClasses.Tomato;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Drink;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Filling;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class FillingFactory extends AbstractFactory {

    @Override
    public Bread getBread(String bread) {
        return null;
    }

    @Override
    public Filling getFiling(String filling) {
        if (filling == null) {
            return null;
        }
        if (filling == "CHE") {
            return new Cheese();
        } else if (filling == "TOM") {
            return new Tomato();
        }
        return null;
    }

    @Override
    public Drink getDrink(String drinkType) {
        return null;
    }
}
