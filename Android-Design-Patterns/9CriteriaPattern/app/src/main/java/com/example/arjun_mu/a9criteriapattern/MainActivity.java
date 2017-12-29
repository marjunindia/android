package com.example.arjun_mu.a9criteriapattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*
    The criteria design pattern provides a clear and concise technique for filtering objects
    according to set criteria. It can be a very powerful tool as this next exercise will
    demonstrate.
    In this example, we will apply a filter pattern to sort through a list of ingredients and filter
    them according to whether they are vegetarian and where they are produced:
     */

    Filter local = new LocalFilter();
    Filter nonLocal = new NonLocalFilter();
    Filter vegetarian = new VegetarianFilter();
    Filter localAndVegetarian = new AndCriteria(local, vegetarian);
    Filter localOrVegetarian = new OrCriteria(local, vegetarian);
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=(TextView) findViewById(R.id.text1);
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(new Ingredient("Cheddar", "Locally produced", true));
        ingredients.add(new Ingredient("Ham", "Cheshire", false));
        ingredients.add(new Ingredient("Tomato", "Kent", true));
        ingredients.add(new Ingredient("Turkey", "Locally produced", false));

        printIngredients(local.meetCriteria(ingredients),
                "LOCAL:\n");
        printIngredients(nonLocal.meetCriteria(ingredients),
                "\nNOT LOCAL:\n");
        printIngredients(vegetarian.meetCriteria(ingredients),
                "\nVEGETARIAN:\n");
        printIngredients(localAndVegetarian.meetCriteria(ingredients),
                "\nLOCAL VEGETARIAN:\n");
        printIngredients(localOrVegetarian.meetCriteria(ingredients),
                "\nENVIRONMENTALLY FRIENDLY:\n");

    }

    public void printIngredients(List<Ingredient> ingredients, String header) {
        mTextView.append(header);
        for (Ingredient ingredient : ingredients) {
            mTextView.append(new StringBuilder()
                    .append(ingredient.getName())
                    .append(" ")
                    .append(ingredient.getLocal())
                    .append("\n")
                    .toString());
        }
    }
}
