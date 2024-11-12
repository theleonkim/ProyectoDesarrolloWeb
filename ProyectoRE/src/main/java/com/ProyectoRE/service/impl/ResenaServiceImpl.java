
package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.ResenasDao;
import com.ProyectoRE.domain.Resenas;
import com.ProyectoRE.service.ResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResenaServiceImpl implements ResenaService {
    
    @Autowired
    private ResenasDao resenasDao;
    

    @Override
    @Transactional(readOnly = true)
    public Resenas getResenas(Resenas resenas) {
        return resenasDao.findById(resenas.getIdResena()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Resenas resenas) {
        resenasDao.save(resenas);
    }
    
}
