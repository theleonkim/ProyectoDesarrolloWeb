/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoRE.domain;

/**
 *
 * @author Kimberly Leon
 */


import com.ProyectoRE.dao.CitaDao;
import com.ProyectoRE.domain.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaDao citaDao;

    public void save(Cita cita) {
        citaDao.save(cita);
    }

    public List<Cita> getCitas() {
        return citaDao.findAll();
    }

    public void delete(Cita cita) {
        citaDao.delete(cita);
    }

    public Cita findById(int id) {
        return citaDao.findById(id).orElse(null);
    }
}
