package com.example.arjun_mu.a3builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.arjun_mu.a3builderpattern.Bread.Bun;
import com.example.arjun_mu.a3builderpattern.Filling.CreamCheese;

public class MainActivity extends AppCompatActivity {

    /*
    The builder design pattern is one of the most useful creational patterns as it builds larger
    objects from smaller ones. This is precisely what we want to do to construct a sandwich
    object from a list of ingredients. The builder pattern has a further advantage in that optional
    features are easy to include later. As before, we will begin by creating an interface; we will
    call it Ingredient and use it to represent both bread and filling.

     */

    /*
    One of the biggest advantages of the builder is how easy it is to add, remove, and modify
    the concrete classes, and even changes in the interface or abstractions require no
    modification of the client source code. This makes the builder pattern one of the most
    powerful, and it can be used in numerous situations. This is not to say that it is always
    preferable to the factory pattern. For simple objects, the factory is often the best choice, and
    of course, patterns exist on different scales and it is not uncommon to find factories nested
    within builders and vice versa.
    */

    /*
    Here, we have provided the builder with two functions: to return a ready-made sandwich
    and a user-customized one. We have no working interface as yet, but we can simulate user
    choice via our client code.
    */
    /*
    We have also delegated output responsibilities to the Sandwich class itself, and this is often
    a good idea as it helps keep our client code clean and obvious,
     */
    private static final String DEBUG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Build a customized sandwich
        SandwichBuilder builder = new SandwichBuilder();
        Sandwich custom = new Sandwich();
        // Simulate user selections
        custom = builder.build(custom, new Bun());
        custom = builder.build(custom, new CreamCheese());
        Log.d(DEBUG_TAG, "CUSTOMIZED");
        custom.getSandwich();
        custom.getCalories();
        // Build a ready made sandwich
        Sandwich offTheShelf = SandwichBuilder.readyMade();
        Log.d(DEBUG_TAG, "READY MADE");
        offTheShelf.getSandwich();
        offTheShelf.getCalories();

    }
}
