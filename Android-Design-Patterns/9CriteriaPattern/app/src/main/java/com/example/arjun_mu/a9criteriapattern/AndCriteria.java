package com.example.arjun_mu.a9criteriapattern;

import java.util.List;

/**
 * Created by arjun_mu on 12/28/2017.
 */

public class AndCriteria implements Filter {

    Filter criteria;
    Filter otherCriteria;

    public AndCriteria(Filter criteria, Filter otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> firstCriteria =
                criteria.meetCriteria(ingredients);
        return otherCriteria.meetCriteria(firstCriteria);    }
}
