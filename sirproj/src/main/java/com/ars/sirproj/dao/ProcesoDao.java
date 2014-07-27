/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Proceso;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface ProcesoDao {

    public void deleteProceso(Proceso proceso);

    public List<Proceso> findAllProceso();

    public void saveProceso(Proceso proceso);

    public void updateProceso(Proceso proceso);

}
