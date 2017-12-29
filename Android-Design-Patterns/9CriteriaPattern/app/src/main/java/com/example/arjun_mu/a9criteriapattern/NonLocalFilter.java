package com.example.arjun_mu.a9criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arjun_mu on 12/28/2017.
 */

public class NonLocalFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> nonLocal = new ArrayList<Ingredient>();
        for (Ingredient ingredient : ingredients) {

            if (ingredient.getLocal() != "Locally produced") {
                nonLocal.add(ingredient);
            }
        }
        return nonLocal;
    }
}
