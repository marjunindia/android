package com.example.arjun_mu.a22statepattern;

import java.util.Objects;

public class Locked implements State {

    @Override
    public void execute(Context context, String input) {

        if (Objects.equals(input, "coin")) {
            Output.setOutput("Please push");
            context.setState(new Unlocked());

        } else {
            Output.setOutput("Insert coin");
        }
    }
}
