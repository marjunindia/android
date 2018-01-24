package com.example.arjun_mu.a13decoratorpattern.BreadDecorator;


import com.example.arjun_mu.a13decoratorpattern.Bread.Bread;
import com.example.arjun_mu.a13decoratorpattern.BreadDecorator.BreadDecorator;

/**
 * Created by arjun_mu on 1/18/2018.
 */

public class LowFatSpread extends BreadDecorator {
    private Bread bread;

    public LowFatSpread(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return bread.getDescription()+"Low fat spread";
    }

    @Override
    public int getKcal() {
        return bread.getKcal()+25;
    }
}
