package com.example.arjun_mu.a17observerpattern;



/**
 * Created by arjun_mu on 1/24/2018.
 */

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    boolean getReady();
    void setReady(boolean b);
    void notifyObserver();
}
