/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bean;

import com.ars.sirproj.bo.FormularioPlantillaBo;
import com.ars.sirproj.dto.Formularioplantilla;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.SaltSource;
import com.ars.sirproj.clases.Mensaje;

/**
 *
 * @author Sonia Garcia
 */
public class FormularioPlantillaBean implements Serializable {

    //DI via Spring
    private FormularioPlantillaBo formularioPlantillaBo;
    private Formularioplantilla formularioPlantillaObj;
    private List<Formularioplantilla> listPlantillas;

    private Mensaje mensaje;

    @Autowired
    private SaltSource saltSource;

    /**
     * Constructor de la clase UsuarioBean
     */
    public FormularioPlantillaBean() {
        formularioPlantillaObj = new Formularioplantilla();
        listPlantillas = new ArrayList<Formularioplantilla>();
        mensaje = new Mensaje();
    }

    public void fillTable() {
        setListPlantillas(getFormularioPlantillaBo().findAllPlantillas());
    }

    public Long getSavePlantilla() {
        return getFormularioPlantillaBo().savePlantilla(getFormularioPlantillaObj());
    }

    public Long getUpdatePlantilla() {
        getFormularioPlantillaBo().updatePlantilla(getFormularioPlantillaObj());
        return 1L;
    }

    public void DeletePlantilla() {
        getFormularioPlantillaBo().deletePlantilla(getFormularioPlantillaObj());
        resetFail();
    }

    public void AccionFormularioPlantilla() {
        try {
            getFormularioPlantillaBo().savePlantilla(getFormularioPlantillaObj());
            mensaje.messageInfo(mensaje.getIinformation());
            fillTable();
        } catch (Exception e) {
            mensaje.messageError(mensaje.getIerror());
            e.printStackTrace();
        }
    }
    public void resetFail() {
        this.formularioPlantillaObj.setIdPlantilla(0L);
        this.formularioPlantillaObj.setNombrePlantilla(null);
        this.formularioPlantillaObj.setDescripcionPlantilla(null);
        this.formularioPlantillaObj.setEstado(null);
        fillTable();

    }
    
     public void RedireccionarPagina(Long idPlanti) {
        try {
           FacesContext.getCurrentInstance().getExternalContext().redirect("createCamposPlantilla.xhtml");
        } catch (Exception e) {
            mensaje.messageError(mensaje.getIerror());
            e.printStackTrace();
        }
    }

    /**
     * @return the formularioPlantillaBo
     */
    public FormularioPlantillaBo getFormularioPlantillaBo() {
        return formularioPlantillaBo;
    }

    /**
     * @param formularioPlantillaBo the formularioPlantillaBo to set
     */
    public void setFormularioPlantillaBo(FormularioPlantillaBo formularioPlantillaBo) {
        this.formularioPlantillaBo = formularioPlantillaBo;
    }

    /**
     * @return the formularioPlantillaObj
     */
    public Formularioplantilla getFormularioPlantillaObj() {
        return formularioPlantillaObj;
    }

    /**
     * @param formularioPlantillaObj the formularioPlantillaObj to set
     */
    public void setFormularioPlantillaObj(Formularioplantilla formularioPlantillaObj) {
        this.formularioPlantillaObj = formularioPlantillaObj;
    }

    /**
     * @return the listPlantillas
     */
    public List<Formularioplantilla> getListPlantillas() {
        return listPlantillas;
    }

    /**
     * @param listPlantillas the listPlantillas to set
     */
    public void setListPlantillas(List<Formularioplantilla> listPlantillas) {
        this.listPlantillas = listPlantillas;
    }

}
