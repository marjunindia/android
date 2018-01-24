package com.example.arjun_mu.a12prototypepattern;


/**
 * Created by arjun_mu on 1/16/2018.
 */

public class Prime extends Sequence {

    public Prime() {
        result = nthPrime(10000);
    }

    public static int nthPrime(int n) {
        int i, count;
        for (i = 2, count = 0; count < n; ++i) {
            if (isPrime(i)) {
                ++count;
            }
        }
        return i - 1;
    }

    // Test for prime number
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
