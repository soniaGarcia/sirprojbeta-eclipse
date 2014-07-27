package com.ars.sirproj.dto;
// Generated 26-feb-2014 12:16:25 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DireccionclienteId generated by hbm2java
 */
@Embeddable
public class DireccionclienteId  implements java.io.Serializable {


     private Integer idDireccion;
     private Integer idCliente;

    public DireccionclienteId() {
    }

    public DireccionclienteId(Integer idDireccion, Integer idCliente) {
       this.idDireccion = idDireccion;
       this.idCliente = idCliente;
    }
   


    @Column(name="id_direccion")
    public Integer getIdDireccion() {
        return this.idDireccion;
    }
    
    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }


    @Column(name="id_cliente")
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DireccionclienteId) ) return false;
		 DireccionclienteId castOther = ( DireccionclienteId ) other; 
         
		 return ( (this.getIdDireccion()==castOther.getIdDireccion()) || ( this.getIdDireccion()!=null && castOther.getIdDireccion()!=null && this.getIdDireccion().equals(castOther.getIdDireccion()) ) )
 && ( (this.getIdCliente()==castOther.getIdCliente()) || ( this.getIdCliente()!=null && castOther.getIdCliente()!=null && this.getIdCliente().equals(castOther.getIdCliente()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdDireccion() == null ? 0 : this.getIdDireccion().hashCode() );
         result = 37 * result + ( getIdCliente() == null ? 0 : this.getIdCliente().hashCode() );
         return result;
   }   


}


