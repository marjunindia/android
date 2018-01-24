package com.example.arjun_mu.a12prototypepattern;

/**
 * Created by arjun_mu on 1/16/2018.
 */

public abstract class Sequence implements Cloneable {

    protected long result;
    private String id;

    public long getResult() {
        return result;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
