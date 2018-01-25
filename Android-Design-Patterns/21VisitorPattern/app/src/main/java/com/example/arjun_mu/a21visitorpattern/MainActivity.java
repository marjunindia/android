package com.example.arjun_mu.a21visitorpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String DEBUG_TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Item[] items = new Item[]{
                new CannedFood(65, "Tomato soup"),
                new FreshFood(60, 2, "Bananas"),
                new CannedFood(45, "Baked beans"),
                new FreshFood(45, 3, "Apples"),

                new SpecialOffer(120, 3, "Ice cream"),
                new SpecialOffer(120, 1, "Cleaner")};

        int total = totalCost(items);
        Log.d(DEBUG_TAG, "Total cost : " + total + "c");
    }
    private int totalCost(Item[] items) {
        Visitor visitor = new Checkout();
        int total = 0;
        for (Item item : items) {
            System.out.println();
            total += item.accept(visitor);
        }
        return total;
    }
}
