/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.dao;

import com.ars.sirproj.dto.CtgCatalogo;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sonia Garcia
 */
@Service
public class CtgCatalogoDaoImpl extends HibernateDaoSupport implements CtgCatalogoDao {

    public CtgCatalogo findCatalogoHijo(String catalogoPadre, String nombreCatalogoHijo) {
        CtgCatalogo catalogo = (CtgCatalogo) getHibernateTemplate().find("from CtgCatalogo where ctgCatPadre = '" + catalogoPadre.trim() + "' and ctgCatNombre = '" + nombreCatalogoHijo + "'").get(0);
        return catalogo;
    }

    public List<CtgCatalogo> findByCatalogoPadre(String catalogoPadre) {
        List<CtgCatalogo> catalogoList = getHibernateTemplate().find("from CtgCatalogo where ctgCatPadre = '" + catalogoPadre.trim() + "'");
        return catalogoList;
    }

}
