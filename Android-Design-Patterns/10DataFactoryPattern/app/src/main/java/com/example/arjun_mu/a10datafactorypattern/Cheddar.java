package com.example.arjun_mu.a10datafactorypattern;

/**
 * Created by arjun_mu on 12/29/2017.
 */

public class Cheddar extends Cheese implements Filling {

    // object of type cheese


    @Override
    public boolean isVeg() {
        return true;
    }

    @Override
    public String getName() {
        return "Cheddar";
    }

    @Override
    public int getImage() {
        return 0;
    }

    @Override
    public int getKcal() {
        return 0;
    }

    @Override
    public boolean getVeg() {
        return false;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
