package com.example.arjun_mu.a9criteriapattern;

/**
 * Created by arjun_mu on 12/28/2017.
 */

public class Ingredient {

    String name;
    String local;
    boolean vegeterian;

    public Ingredient(String name, String local, boolean vegeterian) {
        this.name = name;
        this.local = local;
        this.vegeterian = vegeterian;
    }

    public String getName() {
        return name;
    }

    public String getLocal() {
        return local;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }




}
