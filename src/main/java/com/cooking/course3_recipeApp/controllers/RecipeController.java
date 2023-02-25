package com.cooking.course3_recipeApp.controllers;

import com.cooking.course3_recipeApp.model.Ingredient;
import com.cooking.course3_recipeApp.model.Recipe;
import com.cooking.course3_recipeApp.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public ResponseEntity<Recipe> addRecipe(@RequestBody Recipe recipe) {
        return ResponseEntity.ok(recipeService.addRecipe(recipe));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getById(@PathVariable int id) {
        return ResponseEntity.of(recipeService.getRecipe(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recipe> update(@PathVariable int id, @RequestBody Recipe recipe) {
        return ResponseEntity.ok(recipeService.update(id, recipe));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Recipe> delete(@PathVariable int id) {
        return ResponseEntity.ok(recipeService.delete(id));
    }

    @GetMapping()
    public ResponseEntity<Map> getAll() {
        return ResponseEntity.ok(recipeService.getAll());
    }
}
