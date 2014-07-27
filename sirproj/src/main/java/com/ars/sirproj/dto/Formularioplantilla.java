package com.ars.sirproj.dto;
// Generated 26-feb-2014 12:16:25 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "formularioplantilla", schema = "public")
public class Formularioplantilla implements java.io.Serializable {

    private Long idPlantilla;
    private String nombrePlantilla;
    private String descripcionPlantilla;
    private Boolean estado;
    private Set<Campoplantilla> campoplantillas = new HashSet(0);

    public Formularioplantilla() {
    }

    public Formularioplantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    public Formularioplantilla(Long idPlantilla, String nombrePlantilla, String descripcionPlantilla, Boolean estado, Set<Campoplantilla> campoplantillas) {
        this.idPlantilla = idPlantilla;
        this.nombrePlantilla = nombrePlantilla;
        this.descripcionPlantilla = descripcionPlantilla;
        this.estado = estado;
        this.campoplantillas = campoplantillas;
    }

    @Id
    @Column(name = "id_plantilla", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IdGenerator")
    @SequenceGenerator(allocationSize = 1, name = "IdGenerator", sequenceName = "formularioplantilla_id_seq")
    public Long getIdPlantilla() {
        return this.idPlantilla;
    }

    public void setIdPlantilla(Long idPlantilla) {
        this.idPlantilla = idPlantilla;
    }

    @Column(name = "estado")
    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "formularioplantilla")
    public Set<Campoplantilla> getCampoplantillas() {
        return this.campoplantillas;
    }

    public void setCampoplantillas(Set<Campoplantilla> campoplantillas) {
        this.campoplantillas = campoplantillas;
    }

    /**
     * @return the nombrePlantilla
     */
    @Column(name = "nombre_plantilla", length = 100)
    public String getNombrePlantilla() {
        return nombrePlantilla;
    }

    /**
     * @param nombrePlantilla the nombrePlantilla to set
     */
    public void setNombrePlantilla(String nombrePlantilla) {
        this.nombrePlantilla = nombrePlantilla;
    }

    /**
     * @return the descripcionPlantilla
     */
    @Column(name = "desc_plantilla", length = 150)
    public String getDescripcionPlantilla() {
        return descripcionPlantilla;
    }

    /**
     * @param descripcionPlantilla the descripcionPlantilla to set
     */
    public void setDescripcionPlantilla(String descripcionPlantilla) {
        this.descripcionPlantilla = descripcionPlantilla;
    }

}
