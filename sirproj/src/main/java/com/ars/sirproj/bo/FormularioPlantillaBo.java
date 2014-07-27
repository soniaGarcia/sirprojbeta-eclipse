/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bo;

import com.ars.sirproj.dto.Formularioplantilla;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface FormularioPlantillaBo {

    public void deletePlantilla(Formularioplantilla formularioplantilla);
    public List<Formularioplantilla> findAllPlantillas();
    public Long savePlantilla(Formularioplantilla formularioplantilla);
    public void updatePlantilla(Formularioplantilla formularioplantilla);

}
