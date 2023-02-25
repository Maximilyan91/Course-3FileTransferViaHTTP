package com.cooking.course3_recipeApp.service;

import com.cooking.course3_recipeApp.model.Ingredient;

import java.util.Map;
import java.util.Optional;

public interface IngredientService {

    Ingredient addIngredient(Ingredient ingredient);

    Optional<Ingredient> getIngredient(int id);

    Ingredient update(int id, Ingredient ingredient);
    Ingredient delete(int id);

    Map<Integer, Ingredient> getAll();
}

