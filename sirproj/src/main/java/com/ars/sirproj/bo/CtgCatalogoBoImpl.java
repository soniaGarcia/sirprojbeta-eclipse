/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bo;

import com.ars.sirproj.dao.CtgCatalogoDao;
import com.ars.sirproj.dto.CtgCatalogo;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public class CtgCatalogoBoImpl implements CtgCatalogoBo {

    private CtgCatalogoDao ctgCatalogoDao;

    
    public CtgCatalogo findCatalogoHijo(String catalogoPadre, String nombreCatalogoHijo) {
        return getCtgCatalogoDao().findCatalogoHijo(catalogoPadre, nombreCatalogoHijo);

    }
    
    
   public List<CtgCatalogo> findByCatalogoPadre(String catalogoPadre) {
        return getCtgCatalogoDao().findByCatalogoPadre(catalogoPadre);
    }

    /**
     * @return the ctgCatalogoDao
     */
    public CtgCatalogoDao getCtgCatalogoDao() {
        return ctgCatalogoDao;
    }

    /**
     * @param ctgCatalogoDao the ctgCatalogoDao to set
     */
    public void setCtgCatalogoDao(CtgCatalogoDao ctgCatalogoDao) {
        this.ctgCatalogoDao = ctgCatalogoDao;
    }

}
