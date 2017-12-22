package com.example.arjun_mu.a2abstractfactorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.arjun_mu.a2abstractfactorypattern.FactoryClasses.AbstractFactory;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Bread;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Drink;
import com.example.arjun_mu.a2abstractfactorypattern.InterfacE.Filling;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    /*
    our activity makes uses of a factory generator, which in turn makes use of an abstract factory
    class that handles the task of deciding which actual factory to call, and hence which
    concrete class to create.
     */
    /*
    the abstract factory allow us to make changes to our products without affecting client code or deployment.
     */
    /*
    We would need to extend our abstract factory with something like this:
    abstract Drink getDrink(String drinkType);
    We also, of course, need to implement a DrinkFactory class, but this too would have the
    same structure as the other factories.
    In other words, we can add, delete, change, and generally muck around with the nuts and
    bolts of a project, without ever really having to bother with how these changes are
    perceived by the higher-level logic of our software.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread bread = breadFactory.getBread("BRI");
        Log.d(TAG, bread.name()+" : "+bread.calories());


        AbstractFactory fillingFactory = FactoryGenerator.getFactory("FIL");
        Filling filling = fillingFactory.getFiling("CHE");
        Log.d(TAG, filling.name()+" : "+filling.calories());






        AbstractFactory drinkFactory = FactoryGenerator.getFactory("DRI");
        Drink bri= drinkFactory.getDrink("FANTA");
        Log.d(TAG, bri.name()+" : "+bri.calories());
    }
}
