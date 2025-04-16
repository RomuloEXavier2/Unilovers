package com.unilovers.logitrack.service;

import com.unilovers.logitrack.model.RoboLogistico;
import com.unilovers.logitrack.repository.RoboLogisticoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoboLogisticoService {
    private final RoboLogisticoRepository repository;

    public RoboLogisticoService(RoboLogisticoRepository repository) {
        this.repository = repository;
    }

    public RoboLogistico salvar(RoboLogistico robo) {
        return repository.save(robo);
    }

    public List<RoboLogistico> listar() {
        return repository.findAll();
    }
}
