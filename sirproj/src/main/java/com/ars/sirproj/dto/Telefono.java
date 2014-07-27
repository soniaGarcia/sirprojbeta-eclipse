package com.ars.sirproj.dto;
// Generated 26-feb-2014 12:16:25 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Telefono generated by hbm2java
 */
@Entity
@Table(name="telefono"
    ,schema="public"
)
public class Telefono  implements java.io.Serializable {


     private int idTelefono;
     private int telefono;
     private Boolean estado;
     private Set<Telefonocontacto> telefonocontactos = new HashSet(0);
     private Set<Telefonocliente> telefonoclientes = new HashSet(0);

    public Telefono() {
    }

	
    public Telefono(int idTelefono, int telefono) {
        this.idTelefono = idTelefono;
        this.telefono = telefono;
    }
    public Telefono(int idTelefono, int telefono, Boolean estado, Set<Telefonocontacto> telefonocontactos, Set<Telefonocliente> telefonoclientes) {
       this.idTelefono = idTelefono;
       this.telefono = telefono;
       this.estado = estado;
       this.telefonocontactos = telefonocontactos;
       this.telefonoclientes = telefonoclientes;
    }
   
     @Id 

    
    @Column(name="id_telefono", unique=true, nullable=false)
    public int getIdTelefono() {
        return this.idTelefono;
    }
    
    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    
    @Column(name="telefono", nullable=false)
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="estado")
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="telefono")
    public Set<Telefonocontacto> getTelefonocontactos() {
        return this.telefonocontactos;
    }
    
    public void setTelefonocontactos(Set<Telefonocontacto> telefonocontactos) {
        this.telefonocontactos = telefonocontactos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="telefono")
    public Set<Telefonocliente> getTelefonoclientes() {
        return this.telefonoclientes;
    }
    
    public void setTelefonoclientes(Set<Telefonocliente> telefonoclientes) {
        this.telefonoclientes = telefonoclientes;
    }




}


