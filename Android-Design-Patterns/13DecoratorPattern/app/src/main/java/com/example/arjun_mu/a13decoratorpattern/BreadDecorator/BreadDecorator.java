package com.example.arjun_mu.a13decoratorpattern.BreadDecorator;

import com.example.arjun_mu.a13decoratorpattern.Bread.Bread;

/**
 * Created by arjun_mu on 1/18/2018.
 */

public abstract class BreadDecorator  extends Bread {

    public  abstract String getDescription() ;
    public abstract int getKcal();
}
