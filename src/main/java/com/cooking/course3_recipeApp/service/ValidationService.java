package com.cooking.course3_recipeApp.service;

import com.cooking.course3_recipeApp.model.Ingredient;
import com.cooking.course3_recipeApp.model.Recipe;

public interface ValidationService {
    boolean validate(Recipe recipe);

    boolean validate(Ingredient ingredient);
}
