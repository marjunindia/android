package com.example.arjun_mu.a10datafactorypattern;




public class Brie extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Brie";
    }

    @Override
    public int getImage() {
        return 0;
    }

    @Override
    public int getKcal() {
        return 142;
    }

    @Override
    public boolean isVeg() {
        return false;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 68;
    }
}
