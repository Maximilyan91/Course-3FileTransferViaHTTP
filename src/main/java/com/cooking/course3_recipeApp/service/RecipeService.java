package com.cooking.course3_recipeApp.service;

import com.cooking.course3_recipeApp.model.Recipe;

public interface RecipeService {

    public void addRecipe(Recipe recipe);

    public void getRecipe(int id);
}
