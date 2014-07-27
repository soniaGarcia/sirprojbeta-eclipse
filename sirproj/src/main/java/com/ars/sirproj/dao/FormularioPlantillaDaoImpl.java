/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Formularioplantilla;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sonia Garcia
 */
@Service
public class FormularioPlantillaDaoImpl extends HibernateDaoSupport implements FormularioPlantillaDao {

    
    public List<Formularioplantilla> findAllPlantillas() {
        return getHibernateTemplate().find("from Formularioplantilla where estado = TRUE");

    }

    
    public Long savePlantilla(Formularioplantilla formularioplantilla) {
        //Validando si sera un save o un update
        if (formularioplantilla.getIdPlantilla() == 0) //Si es cero indica que se trata de un save
        //Por lo que se coloca null para 
        //Que automaticamente se coloque un Id en la BD
        {
            formularioplantilla.setIdPlantilla(null);
            formularioplantilla.setEstado(Boolean.TRUE);
        }
        getHibernateTemplate().saveOrUpdate(formularioplantilla);
        return (Long) 1L;
    }

    
    public void updatePlantilla(Formularioplantilla formularioplantilla) {
        getHibernateTemplate().saveOrUpdate(formularioplantilla);
    }

    
    public void deletePlantilla(Formularioplantilla formularioplantilla) {
        getHibernateTemplate().delete(formularioplantilla);
    }
}
