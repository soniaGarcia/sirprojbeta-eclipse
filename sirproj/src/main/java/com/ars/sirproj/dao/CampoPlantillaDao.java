/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Campoplantilla;
import com.ars.sirproj.dto.Formularioplantilla;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface CampoPlantillaDao{

    public void deleteCampoPlantilla(Campoplantilla campoPlantilla);
    public List<Campoplantilla> findAllCamposPlantilla(Formularioplantilla formularioplantilla);
    public Long saveCampoPlantilla(Campoplantilla campoPlantilla);
    public void updateCampoPlantilla(Campoplantilla campoPlantilla);
    
}
