package com.trabalho.service;

import com.trabalho.model.Equipe;

import java.util.List;

public interface EquipeService {
    List<Equipe> findAll();

    Equipe findById(int eqId);

    void add(Equipe equipe);

    void update(Equipe equipe);

    void delete(Equipe equipe);
}
