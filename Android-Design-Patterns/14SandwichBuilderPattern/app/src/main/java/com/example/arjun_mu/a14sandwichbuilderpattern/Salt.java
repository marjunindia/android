package com.example.arjun_mu.a14sandwichbuilderpattern;

public class Salt implements Ingredient {

    @Override
    public String description() {
        return "Salt";
    }

    @Override
    public int kcal() {
        return 0;
    }
}
