package com.ars.sirproj.bo;
import com.ars.sirproj.dao.ClienteDao;
import com.ars.sirproj.dto.Cliente;
import java.util.List;
/**
 *
 * @author Sonia Garcia
 */
public class ClienteBoImpl implements ClienteBo{
    
    private ClienteDao clienteDao;
    
    
    public List<Cliente> findAllCliente(){
                return getClienteDao().findAllCliente();
        }
    
     public void saveCliente(Cliente cliente){
          getClienteDao().saveCliente(cliente);
     }
    
     public void updateCliente(Cliente cliente){
         getClienteDao().updateCliente(cliente);
     }
    
     public void deleteCliente(Cliente cliente){
         getClienteDao().deleteCliente(cliente);
     }

    /**
     * @return the clienteDao
     */
    public ClienteDao getClienteDao() {
        return clienteDao;
    }

    /**
     * @param clienteDao the clienteDao to set
     */
    public void setClienteDao(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

     
     

}
