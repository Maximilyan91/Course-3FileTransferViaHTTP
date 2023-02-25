package com.cooking.course3_recipeApp.exception;

public class ValidationException extends RuntimeException {
    public ValidationException(String entity) {
        super("Ошибка валидации сущности: " + entity);
    }
}
