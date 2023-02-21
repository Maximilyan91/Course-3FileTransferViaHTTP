package com.cooking.course3_recipebook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String appRun() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        return "Имя ученика: Максим Анатольевич Герасименко <br> " +
                "Название проекта: Введение в Maven <br>" +
                "Дата создания проекта: 17.02.2023 <br>" +
                " Описание проекта:  В рамках данного курса будет создано WEB приложение для сайта рецептов";
    }
}
