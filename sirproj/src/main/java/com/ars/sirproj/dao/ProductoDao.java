/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Producto;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface ProductoDao {

    void deleteProducto(Producto producto);

    List<Producto> findAllProducto();

    void saveProducto(Producto producto);

    void updateProducto(Producto producto);
    
}
