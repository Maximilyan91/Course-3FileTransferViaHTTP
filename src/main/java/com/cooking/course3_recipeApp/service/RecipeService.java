package com.cooking.course3_recipeApp.service;

import com.cooking.course3_recipeApp.model.Recipe;

import java.util.Optional;

public interface RecipeService {

     Recipe addRecipe(Recipe recipe);

     Optional<Recipe> getRecipe(int id);
}
