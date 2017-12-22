package com.example.arjun_mu.a2abstractfactorypattern;

import com.example.arjun_mu.a2abstractfactorypattern.FactoryClasses.AbstractFactory;
import com.example.arjun_mu.a2abstractfactorypattern.FactoryClasses.BreadFactory;
import com.example.arjun_mu.a2abstractfactorypattern.FactoryClasses.DrinkFactory;
import com.example.arjun_mu.a2abstractfactorypattern.FactoryClasses.FillingFactory;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class FactoryGenerator {

        public static AbstractFactory getFactory(String factory){

            if (factory == null) {
                return null;
            }
            if(factory=="BRE"){
                return new BreadFactory();
            }
            else if(factory=="FIL"){
                return new FillingFactory();
            }

            else if(factory=="DRI"){
                return new DrinkFactory();
            }
            return  null;

        }

}
