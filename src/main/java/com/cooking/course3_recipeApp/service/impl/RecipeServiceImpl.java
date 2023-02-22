package com.cooking.course3_recipeApp.service.impl;

import com.cooking.course3_recipeApp.exception.ValidationException;
import com.cooking.course3_recipeApp.model.Recipe;
import com.cooking.course3_recipeApp.service.RecipeService;
import com.cooking.course3_recipeApp.service.ValidationService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {


    private static final Map<Integer, Recipe> recipes = new HashMap<>();
    private static int id = 0;
    private final ValidationService validationService;

    public RecipeServiceImpl(ValidationService validationService) {
        this.validationService = validationService;
    }

    @Override
    public Recipe addRecipe(Recipe recipe) {
        if (!validationService.validate(recipe)) {
            throw new ValidationException(recipe.toString());
        }
        return recipes.put(id++, recipe);
    }

    @Override
    public Optional<Recipe> getRecipe(int id) {
        return Optional.ofNullable(recipes.get(id));
    }
}
