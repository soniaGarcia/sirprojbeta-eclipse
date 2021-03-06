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
 * Direccion generated by hbm2java
 */
@Entity
@Table(name="direccion"
    ,schema="public"
)
public class Direccion  implements java.io.Serializable {


     private int idDireccion;
     private Municipio municipio;
     private String direccion;
     private Boolean estado;
     private Set<Direccioncliente> direccionclientes = new HashSet(0);
     private Set<Direccioncontacto> direccioncontactos = new HashSet(0);

    public Direccion() {
    }

	
    public Direccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }
    public Direccion(int idDireccion, Municipio municipio, String direccion, Boolean estado, Set<Direccioncliente> direccionclientes, Set<Direccioncontacto> direccioncontactos) {
       this.idDireccion = idDireccion;
       this.municipio = municipio;
       this.direccion = direccion;
       this.estado = estado;
       this.direccionclientes = direccionclientes;
       this.direccioncontactos = direccioncontactos;
    }
   
     @Id 

    
    @Column(name="id_direccion", unique=true, nullable=false)
    public int getIdDireccion() {
        return this.idDireccion;
    }
    
    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_municipio")
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    
    @Column(name="direccion", length=150)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="estado")
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="direccion")
    public Set<Direccioncliente> getDireccionclientes() {
        return this.direccionclientes;
    }
    
    public void setDireccionclientes(Set<Direccioncliente> direccionclientes) {
        this.direccionclientes = direccionclientes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="direccion")
    public Set<Direccioncontacto> getDireccioncontactos() {
        return this.direccioncontactos;
    }
    
    public void setDireccioncontactos(Set<Direccioncontacto> direccioncontactos) {
        this.direccioncontactos = direccioncontactos;
    }




}


