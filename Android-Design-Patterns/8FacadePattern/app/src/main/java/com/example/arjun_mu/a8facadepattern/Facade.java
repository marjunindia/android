package com.example.arjun_mu.a8facadepattern;

/**
 * Created by arjun_mu on 12/28/2017.
 */

public class Facade {

    private Product facebook;
    private Product twitter;
    private Product home;

    public Facade() {
        facebook = new Facebook();
        twitter = new Home();
        home = new Twitter();
    }

    public int dispenseCrisps() {
        return facebook.dispense();
    }

    public int dispenseFruit(){
        return twitter.dispense();
    }

    public int dispenseDrink(){
        return home.dispense();
    }
}
