
package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.CitaDao;
import com.ProyectoRE.domain.Cita;
import com.ProyectoRE.service.CitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CitaServiceImpl implements CitaService {
    
    @Autowired
    private CitaDao citaDao;
    
    @Override
    public List<Cita> getCitas(){
        List<Cita> lista = citaDao.findAll();
        return lista;   
    }
    
    @Override
    @Transactional(readOnly = true)
    public Cita getCita(Cita cita){
        return citaDao.findById(cita.getIdCita()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Cita cita) {
        citaDao.save(cita);
    }

    @Override
    @Transactional
    public void delete(Cita cita) {
        citaDao.delete(cita);
    }
    
}
