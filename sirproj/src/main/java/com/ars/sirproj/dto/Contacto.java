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
 * Contacto generated by hbm2java
 */
@Entity
@Table(name="contacto"
    ,schema="public"
)
public class Contacto  implements java.io.Serializable {


     private int idContacto;
     private Juzgado juzgado;
     private String primerNombre;
     private String segundoNombre;
     private String primerApellido;
     private String segundoApellido;
     private String cargo;
     private String ocupacion;
     private Set<Telefonocontacto> telefonocontactos = new HashSet(0);
     private Set<Direccioncontacto> direccioncontactos = new HashSet(0);

    public Contacto() {
    }

	
    public Contacto(int idContacto, Juzgado juzgado) {
        this.idContacto = idContacto;
        this.juzgado = juzgado;
    }
    public Contacto(int idContacto, Juzgado juzgado, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String cargo, String ocupacion, Set<Telefonocontacto> telefonocontactos, Set<Direccioncontacto> direccioncontactos) {
       this.idContacto = idContacto;
       this.juzgado = juzgado;
       this.primerNombre = primerNombre;
       this.segundoNombre = segundoNombre;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.cargo = cargo;
       this.ocupacion = ocupacion;
       this.telefonocontactos = telefonocontactos;
       this.direccioncontactos = direccioncontactos;
    }
   
     @Id 

    
    @Column(name="id_contacto", unique=true, nullable=false)
    public int getIdContacto() {
        return this.idContacto;
    }
    
    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_juzgado", nullable=false)
    public Juzgado getJuzgado() {
        return this.juzgado;
    }
    
    public void setJuzgado(Juzgado juzgado) {
        this.juzgado = juzgado;
    }

    
    @Column(name="primer_nombre", length=60)
    public String getPrimerNombre() {
        return this.primerNombre;
    }
    
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    
    @Column(name="segundo_nombre", length=60)
    public String getSegundoNombre() {
        return this.segundoNombre;
    }
    
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    
    @Column(name="primer_apellido", length=60)
    public String getPrimerApellido() {
        return this.primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    
    @Column(name="segundo_apellido", length=60)
    public String getSegundoApellido() {
        return this.segundoApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    
    @Column(name="cargo", length=60)
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    @Column(name="ocupacion", length=60)
    public String getOcupacion() {
        return this.ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contacto")
    public Set<Telefonocontacto> getTelefonocontactos() {
        return this.telefonocontactos;
    }
    
    public void setTelefonocontactos(Set<Telefonocontacto> telefonocontactos) {
        this.telefonocontactos = telefonocontactos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contacto")
    public Set<Direccioncontacto> getDireccioncontactos() {
        return this.direccioncontactos;
    }
    
    public void setDireccioncontactos(Set<Direccioncontacto> direccioncontactos) {
        this.direccioncontactos = direccioncontactos;
    }




}


