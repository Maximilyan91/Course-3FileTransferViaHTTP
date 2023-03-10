package com.cooking.course3_recipeApp.service;

import com.cooking.course3_recipeApp.model.Recipe;

import java.util.Map;
import java.util.Optional;

public interface RecipeService {

     Recipe addRecipe(Recipe recipe);

     Optional<Recipe> getRecipe(Long id);

     Recipe update(Long id, Recipe recipe);
     Recipe delete(Long id);

     Map<Long, Recipe> getAll();
}
