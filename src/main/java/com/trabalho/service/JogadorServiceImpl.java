package com.trabalho.service;

import com.trabalho.dao.JogadorDao;
import com.trabalho.model.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("JogadorService")
@Transactional
public class JogadorServiceImpl extends BaseService implements JogadorService {

    @Autowired
    JogadorDao jogadorDao;

    public List<Jogador> findAll() {
        return jogadorDao.findAll();
    }

    public void add(Jogador jogador) {
        jogadorDao.save(jogador);
    }

    public void update(Jogador jogador) {
        jogadorDao.save(jogador);
    }

    public void delete(Jogador jogador) {
        jogadorDao.delete(jogador);
    }
}
