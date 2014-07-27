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
 * Telefonocliente generated by hbm2java
 */
@Entity
@Table(name="telefonocliente"
    ,schema="public"
)
public class Telefonocliente  implements java.io.Serializable {


     private int idTelcliente;
     private Telefono telefono;
     private Cliente cliente;

    public Telefonocliente() {
    }

	
    public Telefonocliente(int idTelcliente) {
        this.idTelcliente = idTelcliente;
    }
    public Telefonocliente(int idTelcliente, Telefono telefono, Cliente cliente) {
       this.idTelcliente = idTelcliente;
       this.telefono = telefono;
       this.cliente = cliente;
    }
   
     @Id 

    
    @Column(name="id_telcliente", unique=true, nullable=false)
    public int getIdTelcliente() {
        return this.idTelcliente;
    }
    
    public void setIdTelcliente(int idTelcliente) {
        this.idTelcliente = idTelcliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_telefono")
    public Telefono getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cliente")
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




}


