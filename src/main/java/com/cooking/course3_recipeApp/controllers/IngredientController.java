package com.cooking.course3_recipeApp.controllers;

import com.cooking.course3_recipeApp.model.Ingredient;
import com.cooking.course3_recipeApp.service.IngredientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ingredient")
@Tag(name = "Контроллер ингридиентов", description = "CRUD - операции для ингридиентов")
public class  IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
@Operation(summary = "Добавление нового ингридиента")
    @PostMapping
    public ResponseEntity<Ingredient> addIngredient(@RequestBody Ingredient ingredient) {
        return ResponseEntity.ok(ingredientService.addIngredient(ingredient));
    }
    @Operation(summary = "Получение ингридиента по ID")
    @GetMapping("/{id}")
    public ResponseEntity<Ingredient> getById(@PathVariable int id) {
        return ResponseEntity.of(ingredientService.getIngredient(id));
    }
    @Operation(summary = "Обновление ингридиента по ID")
    @PutMapping("/{id}")
    public ResponseEntity<Ingredient> update(@PathVariable int id, @RequestBody Ingredient ingredient) {
        return ResponseEntity.ok(ingredientService.update(id, ingredient));
    }
    @Operation(summary = "Удаление ингридиента по ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Ingredient> delete(@PathVariable int id) {
        return ResponseEntity.ok(ingredientService.delete(id));
    }
    @Operation(summary = "Получение всех ингридиентов")
    @GetMapping()
    public ResponseEntity<Map> getAll() {
        return ResponseEntity.ok(ingredientService.getAll());
    }
}
