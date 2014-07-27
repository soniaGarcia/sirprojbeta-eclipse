package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Proceso;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Sonia Garcia
 */
public class ProcesoDaoImpl extends HibernateDaoSupport implements ProcesoDao {

    
    public List<Proceso> findAllProceso() {
        return getHibernateTemplate().find("from Proceso order by idProceso desc");
    }

    
    public void saveProceso(Proceso proceso) {
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        if (proceso.getIdProceso() == 0) //Si es cero indica que se trata de un save
        //Por lo que se coloca null para 
        //Que automaticamente se coloque un Id en la BD
        {
            proceso.setIdProceso(null);

        }
        proceso.setFechaRegistro(df.format(new Date()));
        getHibernateTemplate().saveOrUpdate(proceso);
    }

    
    public void updateProceso(Proceso proceso) {
        getHibernateTemplate().saveOrUpdate(proceso);
    }

    
    public void deleteProceso(Proceso proceso) {
        getHibernateTemplate().delete(proceso);
    }
}
