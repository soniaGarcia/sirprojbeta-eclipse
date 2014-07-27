package com.ars.sirproj.dto;
// Generated 03-20-2014 09:21:06 AM by Hibernate Tools 3.6.0
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="producto"
    ,schema="public"
)
public class Producto  implements java.io.Serializable {
     private int idProducto;
     private String nombre;
     private Date fechaVto;
     private Boolean estado;
     private String descripcion;
    public Producto() {
    }
    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }
    public Producto(int idProducto, String nombre, Date fechaVto, Boolean estado, String descripcion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.fechaVto = fechaVto;
        this.estado = estado;
        this.descripcion = descripcion;
    }
    
   
     @Id 
    @Column(name="id_producto", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IdGenerator")
    @SequenceGenerator(allocationSize = 1, name = "IdGenerator", sequenceName = "producto_id_seq")
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    @Column(name="nombre", length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="fecha_vto", length=15)
     @Temporal(javax.persistence.TemporalType.DATE)
    public Date getFechaVto() {
        return this.fechaVto;
    }
    
    public void setFechaVto(Date fechaVto) {
        this.fechaVto = fechaVto;
    }
    @Column(name="estado")
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    @Column(name="descripcion")
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
