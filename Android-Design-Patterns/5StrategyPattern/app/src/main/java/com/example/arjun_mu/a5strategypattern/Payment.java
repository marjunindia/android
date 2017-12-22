package com.example.arjun_mu.a5strategypattern;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Payment {
    // Provide context for strategies

    private Strategy mStrategy;

    public Payment(Strategy strategy) {
        mStrategy = strategy;
    }

    public String employStrategy(float f) {
        return mStrategy.processPayment(f);
    }

}
