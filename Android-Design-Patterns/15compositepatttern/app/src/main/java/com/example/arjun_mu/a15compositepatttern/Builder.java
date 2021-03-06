package com.example.arjun_mu.a15compositepatttern;

/**
 * Created by arjun_mu on 1/24/2018.
 */

public class Builder {

    // Define individual components
    Component image = new Leaf(" image view");
    Component text = new Leaf(" text view");
    Component list = new Leaf(" list view");

    // Define composites
    Component layout1(){
        Component c = new Composite("layout 1");
        c.add(image);
        c.add(text);
        return c;
    }

    // Define nested composites
    Component layout2() {
        Component c = new Composite("layout 2");
        c.add(list);
        c.add(layout1());
        return c;
    }
    Component layout3(){
        Component c = new Composite("layout 3");
        c.add(layout1());
        c.add(layout2());
        return c;
    }

}
