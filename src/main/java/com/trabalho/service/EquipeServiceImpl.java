package com.trabalho.service;

import com.trabalho.dao.EquipeDao;
import com.trabalho.model.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("EquipeService")
@Transactional
public class EquipeServiceImpl extends BaseService implements EquipeService {

    @Autowired
    private EquipeDao equipeDao;

    public List<Equipe> findAll() {
        return equipeDao.findAll();
    }

    public Equipe findById(int eqId) {
        return equipeDao.findById(eqId);
    }

    public void add(Equipe equipe) {
        equipeDao.save(equipe);
    }

    public void update(Equipe equipe) {
        equipeDao.save(equipe);
    }

    public void delete(Equipe equipe) {
        equipeDao.delete(equipe);
    }
}
