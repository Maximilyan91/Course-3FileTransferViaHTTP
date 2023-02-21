package com.cooking.course3_recipeApp.service;

import com.cooking.course3_recipeApp.model.Ingredient;

public interface IngredientService {

    void addIngredient(Ingredient ingredient);

    void getIngredient(int id);
}

