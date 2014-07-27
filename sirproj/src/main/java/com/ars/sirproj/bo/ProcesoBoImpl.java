package com.ars.sirproj.bo;
import com.ars.sirproj.dao.ProcesoDao;
import com.ars.sirproj.dto.Proceso;
import java.util.List;
/**
 *
 * @author Sonia Garcia
 */
public class ProcesoBoImpl implements ProcesoBo{
    
    private ProcesoDao procesoDao;
    
    
    public List<Proceso> findAllProceso(){
                return getProcesoDao().findAllProceso();
        }
    
     public void saveProceso(Proceso proceso){
          getProcesoDao().saveProceso(proceso);
     }
    
     public void updateProceso(Proceso proceso){
         getProcesoDao().updateProceso(proceso);
     }
    
     public void deleteProceso(Proceso proceso){
         getProcesoDao().deleteProceso(proceso);
     }

    /**
     * @return the procesoDao
     */
    public ProcesoDao getProcesoDao() {
        return procesoDao;
    }

    /**
     * @param procesoDao the procesoDao to set
     */
    public void setProcesoDao(ProcesoDao procesoDao) {
        this.procesoDao = procesoDao;
    }
     
     

}
