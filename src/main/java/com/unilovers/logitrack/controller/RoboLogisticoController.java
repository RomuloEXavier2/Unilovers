package com.unilovers.logitrack.controller;

import com.unilovers.logitrack.model.RoboLogistico;
import com.unilovers.logitrack.service.RoboLogisticoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/robos")
public class RoboLogisticoController {

    private final RoboLogisticoService service;

    public RoboLogisticoController(RoboLogisticoService service) {
        this.service = service;
    }

    @PostMapping
    public RoboLogistico cadastrar(@RequestBody RoboLogistico robo) {
        return service.salvar(robo);
    }

    @GetMapping
    public List<RoboLogistico> listar() {
        return service.listar();
    }
}
