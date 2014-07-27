/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bo;

import com.ars.sirproj.dao.CampoFormularioDao;
import com.ars.sirproj.dto.Campoformulario;
import com.ars.sirproj.dto.CtgCatalogo;
import com.ars.sirproj.dto.Formularioproceso;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public class CampoFormularioBoImpl implements CampoFormularioBo {

    private CampoFormularioDao campoFormularioDao;

    
    public List<Campoformulario> findAllCampos(Formularioproceso formularioProceso) {

        return campoFormularioDao.findAllCampos(formularioProceso);
    }

    
    public Long saveCampo(Campoformulario campoFormulario) {
        return campoFormularioDao.saveCampo(campoFormulario);
    }

    
    public void updateCampo(Campoformulario campoFormulario) {
        campoFormularioDao.updateCampo(campoFormulario);
    }

    
    public void updateValorCampo(Campoformulario campoFormulario) {
        campoFormularioDao.updateValorCampo(campoFormulario);
    }

    
    public void deleteCampo(Campoformulario campoFormulario) {
        campoFormularioDao.deleteCampo(campoFormulario);
    }

//    
//    public List<CtgCatalogo> findByCatalogoPadre(String catalogoPadre) {
//        return usuarioDao.findByCatalogoPadre(catalogoPadre);
//
//    }
    /**
     * @return the campoFormularioDao
     */
    public CampoFormularioDao getCampoFormularioDao() {
        return campoFormularioDao;
    }

    /**
     * @param campoFormularioDao the campoFormularioDao to set
     */
    public void setCampoFormularioDao(CampoFormularioDao campoFormularioDao) {
        this.campoFormularioDao = campoFormularioDao;
    }

}
