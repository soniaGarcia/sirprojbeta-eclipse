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
 * Listaproducto generated by hbm2java
 */
@Entity
@Table(name="listaproducto"
    ,schema="public"
)
public class Listaproducto  implements java.io.Serializable {


     private int idListaproducto;
     private Compra compra;
     private Producto producto;
     private String monto;
     private String cantProducto;

    public Listaproducto() {
    }

	
    public Listaproducto(int idListaproducto) {
        this.idListaproducto = idListaproducto;
    }
    public Listaproducto(int idListaproducto, Compra compra, Producto producto, String monto, String cantProducto) {
       this.idListaproducto = idListaproducto;
       this.compra = compra;
       this.producto = producto;
       this.monto = monto;
       this.cantProducto = cantProducto;
    }
   
     @Id 

    
    @Column(name="id_listaproducto", unique=true, nullable=false)
    public int getIdListaproducto() {
        return this.idListaproducto;
    }
    
    public void setIdListaproducto(int idListaproducto) {
        this.idListaproducto = idListaproducto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id__compra")
    public Compra getCompra() {
        return this.compra;
    }
    
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_producto")
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
    @Column(name="monto", length=50)
    public String getMonto() {
        return this.monto;
    }
    
    public void setMonto(String monto) {
        this.monto = monto;
    }

    
    @Column(name="cant_producto", length=50)
    public String getCantProducto() {
        return this.cantProducto;
    }
    
    public void setCantProducto(String cantProducto) {
        this.cantProducto = cantProducto;
    }




}

