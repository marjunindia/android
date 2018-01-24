package com.example.arjun_mu.a14sandwichbuilderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arjun_mu on 1/18/2018.
 */

public class SandwichBuilder {

    private List<Ingredient> ingredients = new ArrayList<Ingredient>();


    public Sandwich build(Sandwich sandwich, Ingredient ingredient) {
        sandwich.addIngredient(ingredient);
        return sandwich;
    }


}
