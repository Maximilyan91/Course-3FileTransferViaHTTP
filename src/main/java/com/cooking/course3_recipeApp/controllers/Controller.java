package com.cooking.course3_recipeApp.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Контроллер проверки работоспособности приложения")
public class Controller {
    @GetMapping
    @Operation(description = "при корретной работе программы выведет текстовое сообщение")
    public String appRun() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    @Operation(description = "информация о проекте")
    public String info() {
        return "Имя ученика: Максим Анатольевич Герасименко <br> " +
                "Название проекта: Введение в Maven <br>" +
                "Дата создания проекта: 17.02.2023 <br>" +
                " Описание проекта:  В рамках данного курса будет создано WEB приложение для сайта рецептов";
    }
}
