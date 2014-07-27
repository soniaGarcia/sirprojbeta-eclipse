/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ars.sirproj.dao;

import com.ars.sirproj.dto.CtgCatalogo;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface CtgCatalogoDao {
     public CtgCatalogo findCatalogoHijo(String catalogoPadre, String nombreCatalogoHijo);
     public List<CtgCatalogo> findByCatalogoPadre(String catalogoPadre);
    
}
