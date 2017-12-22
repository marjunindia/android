package com.example.arjun_mu.a5strategypattern;

import javax.crypto.BadPaddingException;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class BasicPrice {

    private static BasicPrice basicPrice = new BasicPrice();

    private float price;

    // Prevent more than one copy
    private BasicPrice() {
    }

    public static BasicPrice getBasicPrice() {
        return basicPrice;
    }

    protected float getPrice() {
        return price;
    }

    protected void setPrice(float v) {
        price = v;
    }

}
