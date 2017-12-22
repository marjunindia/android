package com.example.arjun_mu.a5strategypattern;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class Coupon implements Strategy {
    @Override
    public String processPayment(float price) {
        return String.format("%.2f", price * 0.9f);
    }
}
