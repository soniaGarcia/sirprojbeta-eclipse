package com.ars.sirproj.bo;
import com.ars.sirproj.dao.ProductoDao;
import com.ars.sirproj.dto.Producto;
import java.util.List;
/**
 *
 * @author Sonia Garcia
 */
public class ProductoBoImpl implements ProductoBo{
    
    private ProductoDao ProductoDao;
    
    
    public List<Producto> findAllProducto(){
                return ProductoDao.findAllProducto();
        }
    
     public void saveProducto(Producto Producto){
          ProductoDao.saveProducto(Producto);
     }
    
     public void updateProducto(Producto Producto){
         ProductoDao.updateProducto(Producto);
     }
    
     public void deleteProducto(Producto Producto){
         ProductoDao.deleteProducto(Producto);
     }
    /**
     * @return the ProductoDao
     */
    
    public ProductoDao getProductoDao() {
        return ProductoDao;
    }
    /**
     * @param ProductoDao the ProductoDao to set
     */
    
    public void setProductoDao(ProductoDao ProductoDao) {
        this.ProductoDao = ProductoDao;
    }
}
