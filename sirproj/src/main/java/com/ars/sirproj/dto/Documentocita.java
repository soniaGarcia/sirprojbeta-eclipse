package com.ars.sirproj.dto;
// Generated 26-feb-2014 12:16:25 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Documentocita generated by hbm2java
 */
@Entity
@Table(name="documentocita"
    ,schema="public"
)
public class Documentocita  implements java.io.Serializable {


     private int idDoccita;
     private Documento documento;
     private Cita cita;

    public Documentocita() {
    }

	
    public Documentocita(int idDoccita, Documento documento) {
        this.idDoccita = idDoccita;
        this.documento = documento;
    }
    public Documentocita(int idDoccita, Documento documento, Cita cita) {
       this.idDoccita = idDoccita;
       this.documento = documento;
       this.cita = cita;
    }
   
     @Id 

    
    @Column(name="id_doccita", unique=true, nullable=false)
    public int getIdDoccita() {
        return this.idDoccita;
    }
    
    public void setIdDoccita(int idDoccita) {
        this.idDoccita = idDoccita;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_documento", nullable=false)
    public Documento getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cita")
    public Cita getCita() {
        return this.cita;
    }
    
    public void setCita(Cita cita) {
        this.cita = cita;
    }




}

