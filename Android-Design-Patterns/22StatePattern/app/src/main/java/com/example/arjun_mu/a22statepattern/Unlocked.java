package com.example.arjun_mu.a22statepattern;

import java.util.Objects;

public class Unlocked implements State {

    @Override
    public void execute(Context context, String input) {

        if (Objects.equals(input, "coin")) {
            Output.setOutput("You have already paid");

        } else {
            Output.setOutput("Thank you");
            context.setState(new Locked());
        }
    }
}
