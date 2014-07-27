/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bean;

import com.ars.sirproj.bo.CampoPlantillaBo;
import com.ars.sirproj.bo.CtgCatalogoBo;
import com.ars.sirproj.dto.Campoplantilla;
import com.ars.sirproj.dto.CtgCatalogo;
import com.ars.sirproj.dto.Formularioplantilla;
import com.ars.sirproj.util.UtilConstant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.SaltSource;
import com.ars.sirproj.clases.Mensaje;

/**
 *
 * @author Sonia Garcia
 */
public class CampoPlantillaBean implements Serializable {

    //DI via Spring
    private CampoPlantillaBo campoPlantillaBo;
    private CtgCatalogoBo ctgCatalogoBo;
    private Campoplantilla campoPlantillaObj;
    private CtgCatalogo ctgCatalogoObj;
    private Formularioplantilla formularioplantillaObj;
    private List<Campoplantilla> camposplantilla;
    private List<CtgCatalogo> comboBoxRoles;
    private CtgCatalogo ctgCatalogo;

    private Mensaje mensaje;

    @Autowired
    private SaltSource saltSource;

    /**
     * Constructor de la clase UsuarioBean
     */
    public CampoPlantillaBean() {
        campoPlantillaObj = new Campoplantilla();
        ctgCatalogoObj = new CtgCatalogo();
        formularioplantillaObj = new Formularioplantilla();
        camposplantilla = new ArrayList<Campoplantilla>();
        comboBoxRoles = new ArrayList<CtgCatalogo>();
        ctgCatalogo = new CtgCatalogo();
        mensaje = new Mensaje();
    }

    public void fillTable() {
        Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Long idPlanti = Long.parseLong(params.get("idPlanti").toString().trim());
        String nombrePlanti = params.get("nombrePlanti").toString().trim();
        formularioplantillaObj.setIdPlantilla(idPlanti);
        formularioplantillaObj.setNombrePlantilla(nombrePlanti);
        setCamposplantilla(getCampoPlantillaBo().findAllCamposPlantilla(getFormularioplantillaObj()));
    }

    public void fillComboBoxRol() {
        setComboBoxRoles(getCtgCatalogoBo().findByCatalogoPadre(UtilConstant.CatalogoTiposCampos));
    }

    public Long getSaveCamposPlantilla() {
        return getCampoPlantillaBo().saveCampoPlantilla(getCampoPlantillaObj());
    }

    public Long getUpdateCampoPlantilla() {
        getCampoPlantillaBo().updateCampoPlantilla(getCampoPlantillaObj());
        return 1L;
    }

    public void DeleteCampoPlantilla() {
        getCampoPlantillaBo().deleteCampoPlantilla(getCampoPlantillaObj());
        resetFail();
    }

    public void AccionCampoFormulario() {
        try {
            campoPlantillaObj.setCtgCatalogo(getCtgCatalogoObj());
            campoPlantillaObj.setFormularioplantilla(getFormularioplantillaObj());
            getCampoPlantillaBo().saveCampoPlantilla(getCampoPlantillaObj());
            mensaje.messageInfo(mensaje.getIinformation());
            fillTable();
            fillComboBoxRol();
        } catch (Exception e) {
            mensaje.messageError(mensaje.getIerror());
            e.printStackTrace();
        }
    }

    public CtgCatalogo getCtgCatalogo() {
        return ctgCatalogo;
    }

    public void setCtgCatalogo(CtgCatalogo ctgCatalogo) {
        this.ctgCatalogo = ctgCatalogo;
    }

    public void llenarCatalogo() {
        campoPlantillaObj.setCtgCatalogo(getComboBoxRoles().get(0));
    }

    public void resetFail() {
        this.campoPlantillaObj.setIdCampo(0L);
        this.campoPlantillaObj.setCtgCatalogo(null);
        this.campoPlantillaObj.setFormularioplantilla(null);
        this.campoPlantillaObj.setLargocampo(null);
        this.campoPlantillaObj.setEstado(null);
        this.campoPlantillaObj.setEtiqueta(null);
        fillTable();
        fillComboBoxRol();

    }


    /**
     * @return the comboBoxRoles
     */
    public List<CtgCatalogo> getComboBoxRoles() {
        return comboBoxRoles;
    }

    /**
     * @param comboBoxRoles the comboBoxRoles to set
     */
    public void setComboBoxRoles(List<CtgCatalogo> comboBoxRoles) {
        this.comboBoxRoles = comboBoxRoles;
    }


    /**
     * @return the ctgCatalogoObj
     */
    public CtgCatalogo getCtgCatalogoObj() {
        return ctgCatalogoObj;
    }

    /**
     * @param ctgCatalogoObj the ctgCatalogoObj to set
     */
    public void setCtgCatalogoObj(CtgCatalogo ctgCatalogoObj) {
        this.ctgCatalogoObj = ctgCatalogoObj;
    }


    /**
     * @return the ctgCatalogoBo
     */
    public CtgCatalogoBo getCtgCatalogoBo() {
        return ctgCatalogoBo;
    }

    /**
     * @param ctgCatalogoBo the ctgCatalogoBo to set
     */
    public void setCtgCatalogoBo(CtgCatalogoBo ctgCatalogoBo) {
        this.ctgCatalogoBo = ctgCatalogoBo;
    }

    /**
     * @return the campoPlantillaBo
     */
    public CampoPlantillaBo getCampoPlantillaBo() {
        return campoPlantillaBo;
    }

    /**
     * @param campoPlantillaBo the campoPlantillaBo to set
     */
    public void setCampoPlantillaBo(CampoPlantillaBo campoPlantillaBo) {
        this.campoPlantillaBo = campoPlantillaBo;
    }

    /**
     * @return the campoPlantillaObj
     */
    public Campoplantilla getCampoPlantillaObj() {
        return campoPlantillaObj;
    }

    /**
     * @param campoPlantillaObj the campoPlantillaObj to set
     */
    public void setCampoPlantillaObj(Campoplantilla campoPlantillaObj) {
        this.campoPlantillaObj = campoPlantillaObj;
    }

    /**
     * @return the formularioplantillaObj
     */
    public Formularioplantilla getFormularioplantillaObj() {
        return formularioplantillaObj;
    }

    /**
     * @param formularioplantillaObj the formularioplantillaObj to set
     */
    public void setFormularioplantillaObj(Formularioplantilla formularioplantillaObj) {
        this.formularioplantillaObj = formularioplantillaObj;
    }

    /**
     * @return the camposplantilla
     */
    public List<Campoplantilla> getCamposplantilla() {
        return camposplantilla;
    }

    /**
     * @param camposplantilla the camposplantilla to set
     */
    public void setCamposplantilla(List<Campoplantilla> camposplantilla) {
        this.camposplantilla = camposplantilla;
    }


}
