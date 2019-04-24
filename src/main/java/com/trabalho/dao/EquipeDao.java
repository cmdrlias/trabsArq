package com.trabalho.dao;

import com.trabalho.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EquipeDao extends JpaRepository<Equipe, Integer> {
    @Query("select e from Equipe e ORDER BY eqNome")
    List<Equipe> findAll();
}
