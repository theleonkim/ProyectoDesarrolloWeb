
package com.ProyectoRE.service.impl;

import com.ProyectoRE.dao.ServiciosPremiumDao;
import com.ProyectoRE.domain.ServiciosPremium;
import com.ProyectoRE.service.ServiciosPremiumService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Priscilla Rodríguez
 */
@Service
public class ServiciosPremiumServiceImpl implements ServiciosPremiumService {
    
    @Autowired
    private ServiciosPremiumDao serviciosPremiumDao;
    
    @Override
    public List<ServiciosPremium> getServiciosPremium(boolean estado){
        List<ServiciosPremium> lista = serviciosPremiumDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public ServiciosPremium getServiciosPremium(ServiciosPremium serviciosPremium){
        return serviciosPremiumDao.findById(serviciosPremium.getIdServicioPremium()).orElse(null);
    }
}
