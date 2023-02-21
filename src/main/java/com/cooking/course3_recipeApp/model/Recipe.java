package com.cooking.course3_recipeApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Recipe {
    private String recipeName;
    private int cookingTime;
    private Ingredient ingredient;
    //Шаги приготовления в формате списка строк.
}
