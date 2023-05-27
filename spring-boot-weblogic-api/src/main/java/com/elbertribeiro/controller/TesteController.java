package com.elbertribeiro.controller;

import com.elbertribeiro.teste.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
public class TesteController {
    @Autowired
    private TesteService service;

    @GetMapping
    public String getTest() {
        return service.retornoService();
    }
}
