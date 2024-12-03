package com.prueba_a.service;

import com.prueba_a.dao.CitaDao;
import com.prueba_a.domain.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDao citaDao;

    @Override
    public void save(Cita cita) {
        citaDao.save(cita); 
    }

    @Override
    public Optional<Cita> findById(int idCita) {
        return citaDao.findById(idCita); 
    }

    @Override
    public List<Cita> findAll() {
        return citaDao.findAll();
    }

    @Override
    public void deleteById(int idCita) {
        citaDao.deleteById(idCita); 
    }
}

