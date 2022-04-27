package edu.ilp.sisgailp.service.impl;

import edu.ilp.sisgailp.dao.IEscuelaDao;
import edu.ilp.sisgailp.entity.Escuela;
import edu.ilp.sisgailp.service.IEscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscuelaServiceImpl implements IEscuelaService {

    @Autowired
    private IEscuelaDao escuelaDao;

    @Override
    public List<Escuela> listarEscuelas() {
        return this.escuelaDao.findAll();
    }
}
