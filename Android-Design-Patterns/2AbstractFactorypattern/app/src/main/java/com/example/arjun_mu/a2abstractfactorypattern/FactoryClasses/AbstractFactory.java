package com.example.arjun_mu.a2abstractfactorypattern.FactoryClasses;

import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Bread;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Drink;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Filling;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public abstract class AbstractFactory {

      // create a class that can call on each type of factory

    public abstract Bread getBread(String bread);

    public abstract Filling getFiling(String filling);

    public abstract Drink getDrink(String drinkType);

}
