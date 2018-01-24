package com.example.arjun_mu.a14sandwichbuilderpattern.bread;


import com.example.arjun_mu.a14sandwichbuilderpattern.bread.Bread;

public class Bun extends Bread {
    
    @Override
    public String description() {
        return "Bun with ...";
    }

    @Override
    public int kcal() {
        return 150;
    }
}
