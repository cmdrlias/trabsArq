package com.trabalho.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="equipe")
@NamedQuery(name="Equipe.findAll", query="SELECT e FROM Equipe e")
public class Equipe implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name="eq_id")
    private int eqId;

    @Column(name="eq_nome")
    private String eqNome;

    @Column(name="eq_cor")
    private String eqCor;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="jogador_equipe",
            joinColumns={@JoinColumn(name="eq_id")},
            inverseJoinColumns={@JoinColumn(name="jg_id")})
    private List<Jogador> jogadores;

    public Equipe() { }

    public int getEqId() {
        return eqId;
    }

    public void setEqId(int eqId) {
        this.eqId = eqId;
    }

    public String getEqNome() {
        return eqNome;
    }

    public void setEqNome(String eqNome) {
        this.eqNome = eqNome;
    }

    public String getEqCor() {
        return eqCor;
    }

    public void setEqCor(String eqCor) {
        this.eqCor = eqCor;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
