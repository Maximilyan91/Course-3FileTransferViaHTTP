package com.cooking.course3_recipeApp.service.impl;

import com.cooking.course3_recipeApp.model.Recipe;
import com.cooking.course3_recipeApp.service.RecipeService;

import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.Map;

public class RecipeServiceImpl implements RecipeService {


    private static Map<Integer, Recipe> recipes = new HashMap<>();
    private static int id = 0;


    @Override
    public void addRecipe(Recipe recipe) {
        recipes.put(id++, recipe);
    }

    @Override
    public void getRecipe(int id) {
        recipes.get(id);
    }
}
