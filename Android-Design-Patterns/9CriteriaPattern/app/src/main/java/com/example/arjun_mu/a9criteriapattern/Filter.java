package com.example.arjun_mu.a9criteriapattern;

import java.util.List;

/**
 * Created by arjun_mu on 12/28/2017.
 */

public interface Filter {

    List<Ingredient> meetCriteria(List<Ingredient> ingredients);

}
