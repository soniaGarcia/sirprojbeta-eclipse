package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Proveedor;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface ProveedorDao {

    void deleteProveedor(Proveedor proveedor);

    List<Proveedor> findAllProveedor();

    void saveProveedor(Proveedor proveedor);

    void updateProveedor(Proveedor proveedor);
    
}
