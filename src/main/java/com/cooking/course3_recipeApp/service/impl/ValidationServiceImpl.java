package com.cooking.course3_recipeApp.service.impl;

import com.cooking.course3_recipeApp.model.Ingredient;
import com.cooking.course3_recipeApp.model.Recipe;
import com.cooking.course3_recipeApp.service.ValidationService;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {
@Override
    public boolean validate(Recipe recipe) {
        return recipe != null
                && recipe.getRecipeName() != null
                && recipe.getStepsCook() != null
                && recipe.getIngredient() != null
                && !recipe.getIngredient().isEmpty()
                && !recipe.getStepsCook().isEmpty();
    }
    @Override
    public boolean validate(Ingredient ingredient) {
        return ingredient != null
                && ingredient.getIngredientName() != null
                && !ingredient.getIngredientName().isBlank()
                && ingredient.getIngredientNum() > 0;
    }

}
