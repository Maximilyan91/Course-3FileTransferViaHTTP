package com.cooking.course3_recipeApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Recipe {
    private String recipeName;
    private int cookingTime;
    private List<Ingredient> ingredient;
    private List<String> stepsCook;
}
