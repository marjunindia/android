package com.example.arjun_mu.a2abstractfactorypattern.FactoryClasses;

import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Bread;
import com.example.arjun_mu.a2abstractfactorypattern.ConcreteClasses.Baguette;
import com.example.arjun_mu.a2abstractfactorypattern.ConcreteClasses.Brioche;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Drink;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Filling;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class BreadFactory extends AbstractFactory {

    @Override
    public Bread getBread(String bread) {

        if(bread==null){
            return null;
        }
        if(bread=="BAG"){
            return new Baguette();
        }
        else  if(bread=="BRI"){
            return new Brioche();
        }
        return null;
    }

    @Override
    public Filling getFiling(String filling) {
        return null;
    }

    @Override
    public Drink getDrink(String drinkType) {
        return null;
    }
}
