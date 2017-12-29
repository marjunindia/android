package com.example.arjun_mu.a10datafactorypattern;

/**
 * Created by arjun_mu on 12/29/2017.
 */

public abstract class Cheese implements Filling {

    private String name;
    private int image;
    private int kcal;
    private boolean vegetarian;
    private int price;
    private String description;

    public abstract String getName();

    public abstract int getImage();

    public abstract int getKcal();

    public abstract boolean getVeg();

    public abstract int getPrice();
}
