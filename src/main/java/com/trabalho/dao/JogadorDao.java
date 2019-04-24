package com.trabalho.dao;

import com.trabalho.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JogadorDao extends JpaRepository<Jogador, Integer> {
    @Query("select j from Jogador j ORDER BY jgNome")
    List<Jogador> findAll();
}
