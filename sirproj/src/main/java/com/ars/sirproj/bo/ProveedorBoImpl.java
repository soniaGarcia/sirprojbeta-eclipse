package com.ars.sirproj.bo;
import com.ars.sirproj.dao.ProveedorDao;
import com.ars.sirproj.dto.Proveedor;
import java.util.List;
/**
 *
 * @author Sonia Garcia
 */
public class ProveedorBoImpl implements ProveedorBo{
    
   private ProveedorDao proveedorDao;
    
        public List<Proveedor> findAllProveedor(){
                return proveedorDao.findAllProveedor();
        }
    
     public void saveProveedor(Proveedor proveedor){
          proveedorDao.saveProveedor(proveedor);
     }
    
     public void updateProveedor(Proveedor proveedor){
         proveedorDao.updateProveedor(proveedor);
     }
     
    
     public void deleteProveedor(Proveedor proveedor){
         proveedorDao.deleteProveedor(proveedor);
     }
     
    /**
     * @return the proveedorDao
     */
    
    public ProveedorDao getProveedorDao() {
        return proveedorDao;
    }
    /**
     * @param proveedorDao the proveedorDao to set
     */
    
    public void setProveedorDao(ProveedorDao proveedorDao) {
        this.proveedorDao = proveedorDao;
    }
    
    
}