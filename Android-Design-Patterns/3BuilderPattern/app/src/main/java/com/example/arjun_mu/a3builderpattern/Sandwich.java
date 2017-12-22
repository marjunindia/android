package com.example.arjun_mu.a3builderpattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Sandwich {

    private static final String DEBUG_TAG = "tag";

    // Create list to hold ingredients

    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    // Calculate total calories
    public void getCalories() {
        int c = 0;
        for (Ingredient i : ingredients) {
            c += i.calories();
        }
        Log.d(DEBUG_TAG, "Total calories : " + c + " kcal");

    }

    // Add ingredient
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
    // Output ingredients
    public void getSandwich() {
        for (Ingredient i : ingredients) {
            Log.d(DEBUG_TAG, i.name() + " : " + i.calories() + " kcal");
        }
    }
}