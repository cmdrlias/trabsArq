package com.trabalho.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="jogador")
@NamedQuery(name="Jogador.findAll", query="SELECT j FROM Jogador j")
public class Jogador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name="jg_id")
    private int jgId;

    @Column(name="jg_nome")
    private String jgNome;

    @Column(name="jg_idade")
    private int jgIdade;

    public Jogador() { }

    public int getJgId() {
        return jgId;
    }

    public void setJgId(int jgId) {
        this.jgId = jgId;
    }

    public String getJgNome() {
        return jgNome;
    }

    public void setJgNome(String jgNome) {
        this.jgNome = jgNome;
    }

    public int getJgIdade() {
        return jgIdade;
    }

    public void setJgIdade(int jgIdade) {
        this.jgIdade = jgIdade;
    }
}
