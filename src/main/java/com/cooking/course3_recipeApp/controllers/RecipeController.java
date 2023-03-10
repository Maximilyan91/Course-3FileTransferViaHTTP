package com.cooking.course3_recipeApp.controllers;

import com.cooking.course3_recipeApp.model.Ingredient;
import com.cooking.course3_recipeApp.model.Recipe;
import com.cooking.course3_recipeApp.service.RecipeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/recipe")
@Tag(name = "Контроллер рецептов", description = "CRUD - операции для рецептов")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @Operation(summary = "Добавление нового рецепта")
    @PostMapping
    public ResponseEntity<Recipe> addRecipe(@RequestBody Recipe recipe) {
        return ResponseEntity.ok(recipeService.addRecipe(recipe));
    }
    @Operation(summary = "Получение рецепта по ID")
    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getById(@PathVariable Long id) {
        return ResponseEntity.of(recipeService.getRecipe(id));
    }
    @Operation(summary = "Обновление рецепта по ID")
    @PutMapping("/{id}")
    public ResponseEntity<Recipe> update(@PathVariable Long id, @RequestBody Recipe recipe) {
        return ResponseEntity.ok(recipeService.update(id, recipe));
    }
    @Operation(summary = "Удаление рецепта по ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Recipe> delete(@PathVariable Long id) {
        return ResponseEntity.ok(recipeService.delete(id));
    }
    @Operation(summary = "Получение всех рецептов")
    @GetMapping()
    public ResponseEntity<Map> getAll() {
        return ResponseEntity.ok(recipeService.getAll());
    }
}
