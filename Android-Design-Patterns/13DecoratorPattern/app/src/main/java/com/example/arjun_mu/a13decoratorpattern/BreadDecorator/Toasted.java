package com.example.arjun_mu.a13decoratorpattern.BreadDecorator;

import com.example.arjun_mu.a13decoratorpattern.Bread.Bread;
import com.example.arjun_mu.a13decoratorpattern.BreadDecorator.BreadDecorator;

/**
 * Created by arjun_mu on 1/18/2018.
 */

public class Toasted extends BreadDecorator {

    Bread mBread;

    public Toasted(Bread bread) {
        mBread = bread;
    }

    @Override
    public String getDescription() {
        return mBread.getDescription()+" Toasted";
    }

    @Override
    public int getKcal() {
        return mBread.getKcal()+0;
    }
}
