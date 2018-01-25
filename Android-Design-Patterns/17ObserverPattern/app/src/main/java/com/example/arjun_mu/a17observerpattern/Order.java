package com.example.arjun_mu.a17observerpattern;


/**
 * Created by arjun_mu on 1/24/2018.
 */

public class Order implements Observer {

    private Subject subject = null;

    public Order(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String update() {
        if (subject.getReady()) {
            // Stop receiving notifications
            subject.unregister(this);
            return "Your order is ready to collect";
        } else {
            return "Your sandwich will be ready very soon";
        }
    }
}
