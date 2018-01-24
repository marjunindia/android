package com.example.arjun_mu.a13decoratorpattern.FillingDecorator;


import com.example.arjun_mu.a13decoratorpattern.Filling.Filling;

public abstract class FillingDecorator extends Filling {

    public abstract String getDescription();

    public abstract int getKcal();
}
