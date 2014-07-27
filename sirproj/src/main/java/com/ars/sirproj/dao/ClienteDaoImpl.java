package com.ars.sirproj.dao;
import com.ars.sirproj.dto.Cliente;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 *
 * @author Sonia Garcia
 */
public class ClienteDaoImpl extends HibernateDaoSupport implements ClienteDao{
    
    public List<Cliente> findAllCliente(){
                return getHibernateTemplate().find("from Cliente order by idCliente desc");
        }

    public void saveCliente(Cliente cliente){
       getHibernateTemplate().saveOrUpdate(cliente);
    }

    public void updateCliente(Cliente cliente){
         getHibernateTemplate().saveOrUpdate(cliente);
    }
    
    public void deleteCliente(Cliente cliente){
         getHibernateTemplate().delete(cliente);
    }
}