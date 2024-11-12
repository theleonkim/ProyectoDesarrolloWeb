package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.ResenasDao;
import com.ProyectoRE.domain.Resenas;
import com.ProyectoRE.service.ResenaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResenaServiceImpl implements ResenaService {
    
    @Autowired
    private ResenasDao resenasDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Resenas> getResenas(boolean estado) {
        return resenasDao.findByEstado(estado);
    }

    @Override
    @Transactional(readOnly = true)
    public Resenas getResena(Resenas resena) {
        return resenasDao.findById(resena.getIdResena()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Resenas resena) {
        resenasDao.save(resena);
    }
}
