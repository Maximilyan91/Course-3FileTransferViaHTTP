package com.cooking.course3_recipeApp.service.impl;

import com.cooking.course3_recipeApp.exception.ValidationException;
import com.cooking.course3_recipeApp.model.Ingredient;
import com.cooking.course3_recipeApp.service.IngredientService;
import com.cooking.course3_recipeApp.service.ValidationService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements IngredientService {
    private static int id = 1;

    private static Map<Integer, Ingredient> ingredients = new HashMap<>();
    private final ValidationService validationService;

    public IngredientServiceImpl(ValidationService validationService) {
        this.validationService = validationService;
    }

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        if (!validationService.validate(ingredient)) {
            throw new ValidationException(ingredient.toString());
        }
       return ingredients.put(id++, ingredient);
    }

    @Override
    public Optional<Ingredient> getIngredient(int id) {
        return Optional.empty();
    }
}
