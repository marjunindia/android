package com.example.arjun_mu.a9criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arjun_mu on 12/28/2017.
 */

public class VegetarianFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> vegetarian = new ArrayList<Ingredient>();

        for (Ingredient ingredient : ingredients) {

            if (ingredient.isVegeterian()) {
                vegetarian.add(ingredient);
            }
        }
        return vegetarian;
    }
}
