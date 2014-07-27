/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Campoplantilla;
import com.ars.sirproj.dto.Formularioplantilla;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sonia Garcia
 */
@Service
public class CampoPlantillaDaoImpl extends HibernateDaoSupport implements CampoPlantillaDao {
	
    public List<Campoplantilla> findAllCamposPlantilla(Formularioplantilla formularioplantilla) {
        return getHibernateTemplate().find("from Campoplantilla where formularioplantilla.idPlantilla = " + formularioplantilla.getIdPlantilla() + " and estado = TRUE");

    }
    
    public Long saveCampoPlantilla(Campoplantilla campoPlantilla) {
        //Validando si sera un save o un update
        if (campoPlantilla.getIdCampo() == 0) //Si es cero indica que se trata de un save
        //Por lo que se coloca null para 
        //Que automaticamente se coloque un Id en la BD
        {
            campoPlantilla.setIdCampo(null);
            campoPlantilla.setEstado(Boolean.TRUE);
        }
        getHibernateTemplate().saveOrUpdate(campoPlantilla);
        return (Long) 1L;
    }

    public void updateCampoPlantilla(Campoplantilla campoPlantilla) {
        getHibernateTemplate().saveOrUpdate(campoPlantilla);
    }
    
    public void deleteCampoPlantilla(Campoplantilla campoPlantilla) {
        getHibernateTemplate().delete(campoPlantilla);
    }
}
