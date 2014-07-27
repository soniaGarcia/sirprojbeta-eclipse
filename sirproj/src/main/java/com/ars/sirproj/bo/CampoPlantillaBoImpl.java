/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bo;

import com.ars.sirproj.dao.CampoPlantillaDao;
import com.ars.sirproj.dto.Campoplantilla;
import com.ars.sirproj.dto.Formularioplantilla;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public class CampoPlantillaBoImpl implements CampoPlantillaBo {

    private CampoPlantillaDao campoPlantillaDao;

    
    public List<Campoplantilla> findAllCamposPlantilla(Formularioplantilla formularioplantilla) {
        return getCampoPlantillaDao().findAllCamposPlantilla(formularioplantilla);
    }

    
     public Long saveCampoPlantilla(Campoplantilla campoPlantilla) {
        return getCampoPlantillaDao().saveCampoPlantilla(campoPlantilla);
    }

    
   public void updateCampoPlantilla(Campoplantilla campoPlantilla) {
        getCampoPlantillaDao().updateCampoPlantilla(campoPlantilla);
    }

    
    public void deleteCampoPlantilla(Campoplantilla campoPlantilla) {
        getCampoPlantillaDao().deleteCampoPlantilla(campoPlantilla);
    }

    /**
     * @return the campoPlantillaDao
     */
    public CampoPlantillaDao getCampoPlantillaDao() {
        return campoPlantillaDao;
    }

    /**
     * @param campoPlantillaDao the campoPlantillaDao to set
     */
    public void setCampoPlantillaDao(CampoPlantillaDao campoPlantillaDao) {
        this.campoPlantillaDao = campoPlantillaDao;
    }


   
}
