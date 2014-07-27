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
 * Usuarioproceso generated by hbm2java
 */
@Entity
@Table(name="usuarioproceso"
    ,schema="public"
)
public class Usuarioproceso  implements java.io.Serializable {


     private int idUsrproc;
     private Usuario usuario;
     private Proceso proceso;

    public Usuarioproceso() {
    }

	
    public Usuarioproceso(int idUsrproc) {
        this.idUsrproc = idUsrproc;
    }
    public Usuarioproceso(int idUsrproc, Usuario usuario, Proceso proceso) {
       this.idUsrproc = idUsrproc;
       this.usuario = usuario;
       this.proceso = proceso;
    }
   
     @Id 

    
    @Column(name="id_usrproc", unique=true, nullable=false)
    public int getIdUsrproc() {
        return this.idUsrproc;
    }
    
    public void setIdUsrproc(int idUsrproc) {
        this.idUsrproc = idUsrproc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_usuario")
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_proceso")
    public Proceso getProceso() {
        return this.proceso;
    }
    
    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }




}

