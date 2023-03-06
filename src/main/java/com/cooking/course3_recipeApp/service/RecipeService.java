package com.cooking.course3_recipeApp.service;

import com.cooking.course3_recipeApp.model.Recipe;

import java.util.Map;
import java.util.Optional;

public interface RecipeService {

     Recipe addRecipe(Recipe recipe);

     Optional<Recipe> getRecipe(int id);

     Recipe update(int id, Recipe recipe);
     Recipe delete(int id);

     Map<Integer, Recipe> getAll();
}
