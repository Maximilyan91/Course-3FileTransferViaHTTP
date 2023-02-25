package com.cooking.course3_recipeApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {
    private String ingredientName;
    private int ingredientNum;
    private String unitOfMeasure;

}
