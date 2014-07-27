/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Campoformulario;
import com.ars.sirproj.dto.Formularioproceso;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface CampoFormularioDao {

    public void deleteCampo(Campoformulario campoFormulario);

    public List<Campoformulario> findAllCampos(Formularioproceso formularioProceso);

    public Long saveCampo(Campoformulario campoFormulario);

    public void updateCampo(Campoformulario campoFormulario);

    public void updateValorCampo(Campoformulario campoFormulario);
    

}
