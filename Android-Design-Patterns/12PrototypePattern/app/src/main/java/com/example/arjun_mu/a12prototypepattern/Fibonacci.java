package com.example.arjun_mu.a12prototypepattern;


/**
 * Created by arjun_mu on 1/16/2018.
 */

public class Fibonacci extends Sequence {
    public Fibonacci() {
        result = nthFib(100);
    }
    private static long nthFib(int n) {
        long f = 0;
        long g = 1;
        for (int i = 1; i <= n; i++) {
            f = f + g;
            g = f - g;
        }
        return f;
    }
}
