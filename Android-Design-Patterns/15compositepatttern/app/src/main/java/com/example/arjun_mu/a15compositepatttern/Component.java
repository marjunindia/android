package com.example.arjun_mu.a15compositepatttern;

/**
 * Created by arjun_mu on 1/24/2018.
 */

public interface Component {

    void add(Component component);
    String getName();
    void inflate();
}
