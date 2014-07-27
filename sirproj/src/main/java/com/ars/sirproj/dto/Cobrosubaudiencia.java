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
 * Cobrosubaudiencia generated by hbm2java
 */
@Entity
@Table(name="cobrosubaudiencia"
    ,schema="public"
)
public class Cobrosubaudiencia  implements java.io.Serializable {


     private int idCobrosubau;
     private Cobro cobro;
     private Subaudiencia subaudiencia;

    public Cobrosubaudiencia() {
    }

	
    public Cobrosubaudiencia(int idCobrosubau) {
        this.idCobrosubau = idCobrosubau;
    }
    public Cobrosubaudiencia(int idCobrosubau, Cobro cobro, Subaudiencia subaudiencia) {
       this.idCobrosubau = idCobrosubau;
       this.cobro = cobro;
       this.subaudiencia = subaudiencia;
    }
   
     @Id 

    
    @Column(name="id_cobrosubau", unique=true, nullable=false)
    public int getIdCobrosubau() {
        return this.idCobrosubau;
    }
    
    public void setIdCobrosubau(int idCobrosubau) {
        this.idCobrosubau = idCobrosubau;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cobro")
    public Cobro getCobro() {
        return this.cobro;
    }
    
    public void setCobro(Cobro cobro) {
        this.cobro = cobro;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_subaudiencia")
    public Subaudiencia getSubaudiencia() {
        return this.subaudiencia;
    }
    
    public void setSubaudiencia(Subaudiencia subaudiencia) {
        this.subaudiencia = subaudiencia;
    }




}

