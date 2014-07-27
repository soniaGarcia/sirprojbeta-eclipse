package com.ars.sirproj.bean;
import com.ars.sirproj.bo.ClienteBo;
import com.ars.sirproj.bo.ProcesoBo;
import com.ars.sirproj.dto.Cliente;
import com.ars.sirproj.dto.Proceso;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sonia Garcia
 */
public class ProcesoBean implements Serializable{
    
        private ProcesoBo procesoBo;
        private Proceso   procesoObj;
        private Cliente   clienteObj;
        private ClienteBo clienteBo;
        private List<Proceso> procesoList;
        
        public ProcesoBean(){
        procesoObj = new Proceso();
        clienteObj = new Cliente();
        procesoList   = new ArrayList<Proceso>();
        }
  
        
        
    
    public void deleteProceso(){
       procesoBo.deleteProceso(procesoObj);
        fillTable();
    }
    
    public void fillTable(){
        clienteObj.setCodCliente("1");
        procesoList=getProcesoBo().findAllProceso();
    }
    public void AccionProceso(){
        clienteObj.setCodCliente("1");
        procesoObj.setCliente(clienteObj);
        getProcesoBo().saveProceso(procesoObj);
        fillTable();
        resetFail();
    }
    
    public void resetFail(){
        this.procesoObj.setIdProceso(0L);
        this.procesoObj.setAudiencias(null);
        this.procesoObj.setCitas(null);
        this.procesoObj.setCliente(null);
        this.procesoObj.setCodigo(null);
        this.procesoObj.setDescripcion(null);
        this.procesoObj.setFechaRegistro(null);
        this.procesoObj.setFormularioprocesos(null);
        this.procesoObj.setNombre(null);
        this.procesoObj.setUsuarioprocesos(null);
    }

    /**
     * @return the procesoBo
     */
    public ProcesoBo getProcesoBo() {
        return procesoBo;
    }

    /**
     * @param procesoBo the procesoBo to set
     */
    public void setProcesoBo(ProcesoBo procesoBo) {
        this.procesoBo = procesoBo;
    }

    /**
     * @return the procesoObj
     */
    public Proceso getProcesoObj() {
        return procesoObj;
    }

    /**
     * @param procesoObj the procesoObj to set
     */
    public void setProcesoObj(Proceso procesoObj) {
        this.procesoObj = procesoObj;
    }

    /**
     * @return the procesoList
     */
    public List<Proceso> getProcesoList() {
        return procesoList;
    }

    /**
     * @param procesoList the procesoList to set
     */
    public void setProcesoList(List<Proceso> procesoList) {
        this.procesoList = procesoList;
    }

    /**
     * @return the clienteObj
     */
    public Cliente getClienteObj() {
        return clienteObj;
    }

    /**
     * @param clienteObj the clienteObj to set
     */
    public void setClienteObj(Cliente clienteObj) {
        this.clienteObj = clienteObj;
    }

    /**
     * @return the clienteBo
     */
    public ClienteBo getClienteBo() {
        return clienteBo;
    }

    /**
     * @param clienteBo the clienteBo to set
     */
    public void setClienteBo(ClienteBo clienteBo) {
        this.clienteBo = clienteBo;
    }
    
        
        
        
        
        
}