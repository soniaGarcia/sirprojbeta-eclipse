package com.ars.sirproj.dto;
// Generated 26-feb-2014 12:16:25 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Subaudiencia generated by hbm2java
 */
@Entity
@Table(name="subaudiencia"
    ,schema="public"
)
public class Subaudiencia  implements java.io.Serializable {


     private int idSubaudiencia;
     private Audiencia audiencia;
     private Juzgado juzgado;
     private String fecha;
     private String sentencia;
     private String apelaciones;
     private String recursos;
     private String descripcion;
     private Set<Documentosubaudi> documentosubaudis = new HashSet(0);
     private Set<Cobrosubaudiencia> cobrosubaudiencias = new HashSet(0);
     private Set<Testigosubaudiencia> testigosubaudiencias = new HashSet(0);

    public Subaudiencia() {
    }

	
    public Subaudiencia(int idSubaudiencia, Audiencia audiencia) {
        this.idSubaudiencia = idSubaudiencia;
        this.audiencia = audiencia;
    }
    public Subaudiencia(int idSubaudiencia, Audiencia audiencia, Juzgado juzgado, String fecha, String sentencia, String apelaciones, String recursos, String descripcion, Set<Documentosubaudi> documentosubaudis, Set<Cobrosubaudiencia> cobrosubaudiencias, Set<Testigosubaudiencia> testigosubaudiencias) {
       this.idSubaudiencia = idSubaudiencia;
       this.audiencia = audiencia;
       this.juzgado = juzgado;
       this.fecha = fecha;
       this.sentencia = sentencia;
       this.apelaciones = apelaciones;
       this.recursos = recursos;
       this.descripcion = descripcion;
       this.documentosubaudis = documentosubaudis;
       this.cobrosubaudiencias = cobrosubaudiencias;
       this.testigosubaudiencias = testigosubaudiencias;
    }
   
     @Id 

    
    @Column(name="id_subaudiencia", unique=true, nullable=false)
    public int getIdSubaudiencia() {
        return this.idSubaudiencia;
    }
    
    public void setIdSubaudiencia(int idSubaudiencia) {
        this.idSubaudiencia = idSubaudiencia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_audiencia", nullable=false)
    public Audiencia getAudiencia() {
        return this.audiencia;
    }
    
    public void setAudiencia(Audiencia audiencia) {
        this.audiencia = audiencia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_juzgado")
    public Juzgado getJuzgado() {
        return this.juzgado;
    }
    
    public void setJuzgado(Juzgado juzgado) {
        this.juzgado = juzgado;
    }

    
    @Column(name="fecha", length=15)
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="sentencia", length=100)
    public String getSentencia() {
        return this.sentencia;
    }
    
    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    
    @Column(name="apelaciones", length=100)
    public String getApelaciones() {
        return this.apelaciones;
    }
    
    public void setApelaciones(String apelaciones) {
        this.apelaciones = apelaciones;
    }

    
    @Column(name="recursos", length=100)
    public String getRecursos() {
        return this.recursos;
    }
    
    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    
    @Column(name="descripcion", length=100)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="subaudiencia")
    public Set<Documentosubaudi> getDocumentosubaudis() {
        return this.documentosubaudis;
    }
    
    public void setDocumentosubaudis(Set<Documentosubaudi> documentosubaudis) {
        this.documentosubaudis = documentosubaudis;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="subaudiencia")
    public Set<Cobrosubaudiencia> getCobrosubaudiencias() {
        return this.cobrosubaudiencias;
    }
    
    public void setCobrosubaudiencias(Set<Cobrosubaudiencia> cobrosubaudiencias) {
        this.cobrosubaudiencias = cobrosubaudiencias;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="subaudiencia")
    public Set<Testigosubaudiencia> getTestigosubaudiencias() {
        return this.testigosubaudiencias;
    }
    
    public void setTestigosubaudiencias(Set<Testigosubaudiencia> testigosubaudiencias) {
        this.testigosubaudiencias = testigosubaudiencias;
    }




}


