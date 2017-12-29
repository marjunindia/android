package com.example.arjun_mu.a7bridgepattern;

/**
 * Created by arjun_mu on 12/27/2017.
 */

public abstract class AbstractSandwich {

    


    protected SandwichInterface sandwichInterface;

    protected AbstractSandwich(SandwichInterface sandwichInterface) {
        this.sandwichInterface = sandwichInterface;
    }
    public abstract void make();
}
