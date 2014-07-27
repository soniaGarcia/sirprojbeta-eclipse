/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bo;

import com.ars.sirproj.dao.FormularioPlantillaDao;
import com.ars.sirproj.dto.Formularioplantilla;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public class FormularioPlantillaBoImpl implements FormularioPlantillaBo {

    private FormularioPlantillaDao formularioPlantillaDao;

    
    public List<Formularioplantilla> findAllPlantillas() {
        return getFormularioPlantillaDao().findAllPlantillas();
    }

    
     public Long savePlantilla(Formularioplantilla formularioplantilla) {
        return getFormularioPlantillaDao().savePlantilla(formularioplantilla);
    }

    
   public void updatePlantilla(Formularioplantilla formularioplantilla) {
        getFormularioPlantillaDao().updatePlantilla(formularioplantilla);
    }

    
    public void deletePlantilla(Formularioplantilla formularioplantilla) {
        getFormularioPlantillaDao().deletePlantilla(formularioplantilla);
    }

    /**
     * @return the formularioPlantillaDao
     */
    public FormularioPlantillaDao getFormularioPlantillaDao() {
        return formularioPlantillaDao;
    }

    /**
     * @param formularioPlantillaDao the formularioPlantillaDao to set
     */
    public void setFormularioPlantillaDao(FormularioPlantillaDao formularioPlantillaDao) {
        this.formularioPlantillaDao = formularioPlantillaDao;
    }




   
}
