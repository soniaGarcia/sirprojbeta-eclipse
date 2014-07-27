/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ars.sirproj.bo;

import com.ars.sirproj.dao.ProveedorDao;
import com.ars.sirproj.dto.Proveedor;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface ProveedorBo {

    void deleteProveedor(Proveedor proveedor);

    List<Proveedor> findAllProveedor();

    /**
     * @return the proveedorDao
     */
    ProveedorDao getProveedorDao();

    void saveProveedor(Proveedor proveedor);

    /**
     * @param proveedorDao the proveedorDao to set
     */
    void setProveedorDao(ProveedorDao proveedorDao);

    void updateProveedor(Proveedor proveedor);
    
}
