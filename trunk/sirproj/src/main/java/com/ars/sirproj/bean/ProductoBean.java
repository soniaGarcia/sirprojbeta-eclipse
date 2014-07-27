package com.ars.sirproj.bean;
import com.ars.sirproj.bo.ProductoBo;
import com.ars.sirproj.dto.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sonia Garcia
 */
public class ProductoBean implements Serializable{
    
        private ProductoBo productoBo;
        private Producto   productoObj;
        private List<Producto> productosList;
        
        public ProductoBean(){
        productoObj = new Producto();
        productosList   = new ArrayList<Producto>();
        }
    public ProductoBo getProductoBo() {
        return productoBo;
    }
    public void setProductoBo(ProductoBo productoBo) {
        this.productoBo = productoBo;
    }
    public Producto getProductoObj() {
        return productoObj;
    }
    public void setProductoObj(Producto productoObj) {
        this.productoObj = productoObj;
    }
    public List<Producto> getProductosList() {
        return productosList;
    }
    public void setProductosList(List<Producto> productosList) {
        this.productosList = productosList;
    }
        
    
    public void deleteProductoInactivo(){
        productoObj.setEstado(Boolean.FALSE);
        getProductoBo().saveProducto(productoObj);
        fillTable();
    }
    
    public void fillTable(){
        productosList=getProductoBo().findAllProducto();
    }
    public void AccionProducto(){
        productoObj.setEstado(Boolean.TRUE);
        getProductoBo().saveProducto(productoObj);
        fillTable();
        resetFail();
    }
    
    public void resetFail(){
        this.productoObj.setIdProducto(0);
        this.productoObj.setNombre(null);
        this.productoObj.setFechaVto(null);
        this.productoObj.setEstado(Boolean.TRUE);
        this.productoObj.setDescripcion(null);
    }
    
        
        
        
        
        
}