/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Campoformulario;
import com.ars.sirproj.dto.Formularioproceso;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sonia Garcia Sonia Garcia
 */
@Service
public class CampoFormularioDaoImpl extends HibernateDaoSupport implements CampoFormularioDao {

    public List<Campoformulario> findAllCampos(Formularioproceso formularioProceso) {
        List<Campoformulario> lista = getHibernateTemplate().find("from Campoformulario where formularioproceso.idFormulario = " + formularioProceso.getIdFormulario() + " and estado = TRUE");

        return lista;
    }
    

    public Long saveCampo(Campoformulario campoFormulario) {
        //Validando si sera un save o un update
        if (campoFormulario.getIdCampo() == 0) //Si es cero indica que se trata de un save
        //Por lo que se coloca null para 
        //Que automaticamente se coloque un Id en la BD
        {
            campoFormulario.setIdCampo(null);
            campoFormulario.setEstado(Boolean.TRUE);
        }
        getHibernateTemplate().saveOrUpdate(campoFormulario);
        return (Long) 1L;
    }

    public void updateCampo(Campoformulario campoFormulario) {
        getHibernateTemplate().saveOrUpdate(campoFormulario);
    }

    public void updateValorCampo(Campoformulario campoFormulario) {
        getHibernateTemplate().bulkUpdate("UPDATE Campoformulario set valorcampo = '" + campoFormulario.getValorcampo() + "' where idCampo= " + campoFormulario.getIdCampo());
    }

    public void deleteCampo(Campoformulario campoFormulario) {
        getHibernateTemplate().delete(campoFormulario);
    }
}
