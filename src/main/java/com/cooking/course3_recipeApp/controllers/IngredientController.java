package com.cooking.course3_recipeApp.controllers;

import com.cooking.course3_recipeApp.model.Ingredient;
import com.cooking.course3_recipeApp.service.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ingredient")
public class  IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public ResponseEntity<Ingredient> addIngredient(@RequestBody Ingredient ingredient) {
        return ResponseEntity.ok(ingredientService.addIngredient(ingredient));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingredient> getById(@PathVariable int id) {
        return ResponseEntity.of(ingredientService.getIngredient(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ingredient> update(@PathVariable int id, @RequestBody Ingredient ingredient) {
        return ResponseEntity.ok(ingredientService.update(id, ingredient));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Ingredient> delete(@PathVariable int id) {
        return ResponseEntity.ok(ingredientService.delete(id));
    }

    @GetMapping()
    public ResponseEntity<Map> getAll() {
        return ResponseEntity.ok(ingredientService.getAll());
    }
}
