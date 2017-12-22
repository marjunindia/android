package com.example.arjun_mu.factorypattern;

import com.example.arjun_mu.factorypattern.ConcreteClasses.Baguette;
import com.example.arjun_mu.factorypattern.ConcreteClasses.Brioche;
import com.example.arjun_mu.factorypattern.ConcreteClasses.Roll;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class BreadFactory {

    public Bread getBread(String breadType){

        if(breadType=="BRI"){
            return  new Brioche(); // create new object of type bread
        }
        else if(breadType=="BAG"){
            return  new Baguette();
        }
        else  if(breadType=="ROL"){
            return new Roll();
        }



        return null;
    }

}
