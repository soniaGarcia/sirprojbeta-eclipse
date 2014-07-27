package com.ars.sirproj.bean;
import com.ars.sirproj.bo.ProveedorBo;
import com.ars.sirproj.dto.Proveedor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sonia Garcia
 */
public class ProveedorBean implements Serializable{
    
       //DI via Spring
        private ProveedorBo proveedorBo;
        private Proveedor proveedorObj;
        private List<Proveedor> proveedores;
         //get all customer data from database
        /**
     * Creates a new instance of ProveedorManagedBean
     */
        public ProveedorBean(){
        proveedorObj = new Proveedor();
        proveedores = new ArrayList<Proveedor>();
        
        }
        
        public void fillTable(){
        proveedores=getProveedorBo().findAllProveedor();
    }
        
        public List<Proveedor> getProveedorList(){
            return proveedores;
            //return lista;
        }
        
        public void setProveedorList(List<Proveedor> proveedores){
            this.proveedores=proveedores;
            //return lista;
        }
        
        public void getSaveProveedor(){
            getProveedorBo().saveProveedor(proveedorObj);
        }
        public void AccionProveedor(){
         proveedorObj.setEstado(Boolean.TRUE);
         getProveedorBo().saveProveedor(proveedorObj);
         fillTable();
         resetFail();
       }
        
        public void delteProveedorInactivo(){
         proveedorObj.setEstado(Boolean.FALSE);
         getProveedorBo().saveProveedor(proveedorObj);
         fillTable();
       }
        
         public Long getUpdateProveedor(){
             return 1L;
        }
         
        public Long getDeleteProveedor(){
             return 1L;
        }
                 
    /**
     * @return the proveedorBo
     */
    public ProveedorBo getProveedorBo() {
        return proveedorBo;
    }
    /**
     * @param proveedorBo the proveedorBo to set
     */
    public void setProveedorBo(ProveedorBo proveedorBo) {
        this.proveedorBo = proveedorBo;
    }
    /**
     * @return the proveedores
     */
    public Proveedor getProveedorObj() {
        System.out.println("id="+this.proveedorObj.getIdProveedor());
        return proveedorObj;
    }
    /**
     * @param proveedores resetear los campos del formulario
     */
    public void setProveedorObj(Proveedor proveedorObj) {
        this.proveedorObj = proveedorObj;
    }
    
     public void resetFail() {  
        this.proveedorObj.setIdProveedor(0);  
        this.proveedorObj.setCeluar(null);
        this.proveedorObj.setEmail(null);
        this.proveedorObj.setFechaIngreso(null);
        this.proveedorObj.setNombre(null);
        this.proveedorObj.setTelefono(null);
        this.proveedorObj.setEstado(null);
        fillTable();
          
    }  
     
}