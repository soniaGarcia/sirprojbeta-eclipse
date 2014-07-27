/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ars.sirproj.bo;

import com.ars.sirproj.dao.ProductoDao;
import com.ars.sirproj.dto.Producto;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface ProductoBo {

    void deleteProducto(Producto Producto);

    List<Producto> findAllProducto();

    /**
     * @return the ProductoDao
     */
    ProductoDao getProductoDao();

    void saveProducto(Producto Producto);

    /**
     * @param ProductoDao the ProductoDao to set
     */
    void setProductoDao(ProductoDao ProductoDao);

    void updateProducto(Producto Producto);
    
}
