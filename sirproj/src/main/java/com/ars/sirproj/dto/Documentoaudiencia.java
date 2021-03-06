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
 * Documentoaudiencia generated by hbm2java
 */
@Entity
@Table(name="documentoaudiencia"
    ,schema="public"
)
public class Documentoaudiencia  implements java.io.Serializable {


     private int idDocaudi;
     private Documento documento;
     private Audiencia audiencia;

    public Documentoaudiencia() {
    }

	
    public Documentoaudiencia(int idDocaudi, Documento documento) {
        this.idDocaudi = idDocaudi;
        this.documento = documento;
    }
    public Documentoaudiencia(int idDocaudi, Documento documento, Audiencia audiencia) {
       this.idDocaudi = idDocaudi;
       this.documento = documento;
       this.audiencia = audiencia;
    }
   
     @Id 

    
    @Column(name="id_docaudi", unique=true, nullable=false)
    public int getIdDocaudi() {
        return this.idDocaudi;
    }
    
    public void setIdDocaudi(int idDocaudi) {
        this.idDocaudi = idDocaudi;
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
    @JoinColumn(name="id_audiencia")
    public Audiencia getAudiencia() {
        return this.audiencia;
    }
    
    public void setAudiencia(Audiencia audiencia) {
        this.audiencia = audiencia;
    }




}


