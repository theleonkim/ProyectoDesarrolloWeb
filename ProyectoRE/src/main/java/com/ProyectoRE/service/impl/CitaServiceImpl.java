package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.CitaDao;
import com.ProyectoRE.domain.Cita;
import com.ProyectoRE.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDao citaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cita> getCitas() {
        return citaDao.findAll();
    }

    @Override
    @Transactional
    public void save(Cita cita) {
        citaDao.save(cita);
    }

    @Override
    @Transactional(readOnly = true)
    public Cita findById(int id) {
        return citaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Cita cita) {
        citaDao.delete(cita);
    }
}
