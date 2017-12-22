package com.example.arjun_mu.a3builderpattern.Filling;

import com.example.arjun_mu.a3builderpattern.AbstractClass.Filling;

/**
 * Created by arjun_mu on 12/21/2017.
 */

public class SmokedSalmon extends Filling {
    @Override
    public String name() {
        return "Smoked salmon";
    }

    @Override
    public int calories() {
        return 400;
    }
}
