package com.example.arjun_mu.a9criteriapattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by arjun_mu on 12/28/2017.
 */

public class LocalFilter implements Filter {
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> local = new ArrayList<Ingredient>();
        for (Ingredient ingredient : ingredients) {
            if (Objects.equals(ingredient.getLocal(), "Locally produced"))
            {
                local.add(ingredient);
            }
        }
        return local;
    }
}
