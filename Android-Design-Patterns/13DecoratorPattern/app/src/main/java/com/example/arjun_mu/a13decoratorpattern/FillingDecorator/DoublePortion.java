package com.example.arjun_mu.a13decoratorpattern.FillingDecorator;

import com.example.arjun_mu.a13decoratorpattern.Filling.Filling;

/**
 * Created by arjun_mu on 1/18/2018.
 */

public class DoublePortion extends FillingDecorator {
    private Filling filling;

    public DoublePortion(Filling filling) {
        this.filling = filling;
    }


    @Override
    public String getDescription() {
        return filling.getDescription()+" Double Portion";
    }

    @Override
    public int getKcal() {
        return filling.getKcal()*2;
    }
}
