package com.ars.sirproj.dao;
import com.ars.sirproj.dto.Proveedor;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 *
 * @author Sonia Garcia
 */
public class ProveedorDaoImpl extends HibernateDaoSupport implements ProveedorDao{
    
    
    public List<Proveedor> findAllProveedor(){
                return getHibernateTemplate().find("from Proveedor where estado = true order by idProveedor desc");
        }
    
    public void saveProveedor(Proveedor proveedor){
       getHibernateTemplate().saveOrUpdate(proveedor);
    }
    
    public void updateProveedor(Proveedor proveedor){
         getHibernateTemplate().saveOrUpdate(proveedor);
    }
    
    
    public void deleteProveedor(Proveedor proveedor){
         getHibernateTemplate().delete(proveedor);
    }
}