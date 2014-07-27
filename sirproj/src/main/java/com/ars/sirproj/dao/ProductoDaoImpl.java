package com.ars.sirproj.dao;
import com.ars.sirproj.dto.Producto;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 *
 * @author Sonia Garcia
 */
public class ProductoDaoImpl extends HibernateDaoSupport implements ProductoDao{
    
    
    public List<Producto> findAllProducto(){
                return getHibernateTemplate().find("from Producto where estado = true order by idProducto desc");
        }
    
    public void saveProducto(Producto producto){
       getHibernateTemplate().saveOrUpdate(producto);
    }
    
    public void updateProducto(Producto producto){
         getHibernateTemplate().saveOrUpdate(producto);
    }
    
    public void deleteProducto(Producto producto){
         getHibernateTemplate().delete(producto);
    }
    
}