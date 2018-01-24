package com.example.arjun_mu.a14sandwichbuilderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arjun_mu on 1/18/2018.
 */
// Manage array of ingredients, calculate total calories
// and return completed array
public class Sandwich {

    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    // Add individual ingredients
    public void addIngredient(Ingredient i) {
        ingredients.add(i);
    }

    // Calculate calories in sandwich
    public int getKcal() {
        int cal = 0;

        for (Ingredient ingredient : ingredients) {
            cal += ingredient.kcal();
        }

        return cal;
    }

    // Return all ingredients when selection is complete
    public String getSandwich() {
        String sandwich = "";

        for (Ingredient ingredient : ingredients) {
            sandwich += ingredient.description() + "\n";
        }

        return sandwich;
    }
}
