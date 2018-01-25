package com.example.arjun_mu.a22statepattern;

public class Context {
    private State state;

    public Context() {
        setState(new Locked());
    }

    public void setState(State state) {
        this.state = state;
    }

    public void execute(String input) {
        state.execute(this, input);
    }
}
