package com.example.arjun_mu.a7bridgepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /*

        The main difference between adapters and bridges is that adapters are built to correct
        incompatibilities that arise from our design, whereas a bridge is constructed before, and its
        purpose is to separate an interface from its implementation, so that we can modify and even
        replace the implementation without changing client code.
        In the following example, we will assume that users of our sandwich builder app will have
        a choice of open or closed sandwiches. Apart from this one factor, these sandwiches are
        identical in that they can contain any combination of fillings, although to simplify matters,
        there will only be a maximum of two ingredients. This will demonstrate how we can
        decouple an abstract class from its implementations so that they be modified
        independently.
     */

    /*
    What this demonstrates is how the pattern allows us to make our sandwich in different
    ways using the same abstract class method but different bridge implementer classes.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractSandwich openSandwich = new Sandwich(new Open(),"Cheese","Tomato");
        openSandwich.make();


        AbstractSandwich closedSandwich = new Sandwich(new
                Closed(),"Ham ", "Eggs" );
        closedSandwich.make();
    }
}
