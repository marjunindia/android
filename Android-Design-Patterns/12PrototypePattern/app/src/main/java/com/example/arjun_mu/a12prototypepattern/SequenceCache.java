package com.example.arjun_mu.a12prototypepattern;

import java.util.Hashtable;

/**
 * Created by arjun_mu on 1/16/2018.
 */

public class SequenceCache {

    private static Hashtable<String, Sequence> sequenceHashtable = new
            Hashtable<String, Sequence>();

    public static Sequence getSequence(String sequenceId) {
        Sequence cachedSequence = sequenceHashtable.get(sequenceId);
        try {
            return (Sequence) cachedSequence.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void loadCache() {
        Prime prime = new Prime();
        prime.setId("1");
        sequenceHashtable.put(prime.getId(), prime);

        Fibonacci fib = new Fibonacci();
        fib.setId("2");
        sequenceHashtable.put(fib.getId(), fib);
    }

}
