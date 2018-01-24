package com.example.arjun_mu.a14sandwichbuilderpattern.filling;


import com.example.arjun_mu.a14sandwichbuilderpattern.filling.Filling;

public class SmokedSalmon extends Filling {

    @Override
    public String description() {
        return "Smoked salmon";
    }

    @Override
    public int kcal() {
        return 300;
    }
}
