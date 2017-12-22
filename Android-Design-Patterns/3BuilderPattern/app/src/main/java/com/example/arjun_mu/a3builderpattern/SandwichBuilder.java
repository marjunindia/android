package com.example.arjun_mu.a3builderpattern;

import com.example.arjun_mu.a3builderpattern.Bread.Bagel;
import com.example.arjun_mu.a3builderpattern.Filling.CreamCheese;
import com.example.arjun_mu.a3builderpattern.Filling.SmokedSalmon;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class SandwichBuilder {

    // Off the shelf sandwich
    public static Sandwich readyMade() {
        Sandwich sandwich = new Sandwich();
        sandwich.addIngredient(new Bagel());
        sandwich.addIngredient(new SmokedSalmon());
        sandwich.addIngredient(new CreamCheese());
        return sandwich;
    }
    // Customized sandwich
    public static Sandwich build(Sandwich s, Ingredient i) {
        s.addIngredient(i);
        return s;
    }
}
