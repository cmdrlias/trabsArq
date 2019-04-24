package com.trabalho.service;

import com.trabalho.model.Jogador;

import java.util.List;

public interface JogadorService {
    List<Jogador> findAll();

    void add(Jogador jogador);

    void update(Jogador jogador);

    void delete(Jogador jogador);
}
