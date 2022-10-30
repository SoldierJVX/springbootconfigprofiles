package com.digitalinnovationone.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMesssage;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

    @GetMapping("/")
    public String getAppMesssage(){
        return appMesssage;
    }

    @GetMapping("/enVariable")
    public String getDbEnvironmentVariable() {
        return "A seguinte variável de ambiente foi passada: " + dbEnvironmentVariable;
    }
}
