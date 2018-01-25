package com.example.arjun_mu.a17observerpattern;

import java.util.ArrayList;

/**
 * Created by arjun_mu on 1/24/2018.
 */

public class Sandwich implements Subject {

    public boolean ready;

    // Maintain a list of observers
    private ArrayList<Observer> orders = new ArrayList<Observer>();

    @Override
    public void register(Observer o) {
        orders.add(o);
    }

    @Override
    public void unregister(Observer o) {
        orders.remove(o);
    }

    @Override
    public boolean getReady() {
        return false;
    }

    @Override
    public void setReady(boolean b) {
        this.ready = b;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer order : orders) {
            order.update();
        }
    }
}
