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
 * Cobroaudiencia generated by hbm2java
 */
@Entity
@Table(name="cobroaudiencia"
    ,schema="public"
)
public class Cobroaudiencia  implements java.io.Serializable {


     private int idCobroaudiencia;
     private Audiencia audiencia;
     private Cobro cobro;

    public Cobroaudiencia() {
    }

	
    public Cobroaudiencia(int idCobroaudiencia) {
        this.idCobroaudiencia = idCobroaudiencia;
    }
    public Cobroaudiencia(int idCobroaudiencia, Audiencia audiencia, Cobro cobro) {
       this.idCobroaudiencia = idCobroaudiencia;
       this.audiencia = audiencia;
       this.cobro = cobro;
    }
   
     @Id 

    
    @Column(name="id_cobroaudiencia", unique=true, nullable=false)
    public int getIdCobroaudiencia() {
        return this.idCobroaudiencia;
    }
    
    public void setIdCobroaudiencia(int idCobroaudiencia) {
        this.idCobroaudiencia = idCobroaudiencia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_audiencia")
    public Audiencia getAudiencia() {
        return this.audiencia;
    }
    
    public void setAudiencia(Audiencia audiencia) {
        this.audiencia = audiencia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cobro")
    public Cobro getCobro() {
        return this.cobro;
    }
    
    public void setCobro(Cobro cobro) {
        this.cobro = cobro;
    }




}

