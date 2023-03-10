package com.cooking.course3_recipeApp.service;

import com.cooking.course3_recipeApp.model.Ingredient;

import java.util.Map;
import java.util.Optional;

public interface IngredientService {

    Ingredient addIngredient(Ingredient ingredient);

    Optional<Ingredient> getIngredient(Long id);

    Ingredient update(Long id, Ingredient ingredient);


    Ingredient delete(Long id);

    Map<Long, Ingredient> getAll();
}

