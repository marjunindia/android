package com.example.arjun_mu.a14sandwichbuilderpattern.filling;


import com.example.arjun_mu.a14sandwichbuilderpattern.filling.Filling;

public class CreamCheese extends Filling {

    @Override
    public String description() {
        return "Cream cheese";
    }

    @Override
    public int kcal() {
        return 250;
    }
}
