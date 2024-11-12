/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.ResenasDao;
import com.ProyectoRE.domain.Resenas;
import com.ProyectoRE.service.ResenaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Priscilla Rodríguez
 */
@Service
public class ResenaServiceImpl implements ResenaService {
    @Autowired
    private ResenasDao resenaDao;
    
    @Override
    public List<Resenas> getResenas(){
        List<Resenas> lista = resenaDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional
    public void save(Resenas resena){
        resenaDao.save(resena);
    }
}
