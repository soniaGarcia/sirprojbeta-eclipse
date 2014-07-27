/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bean;

import com.ars.sirproj.bo.CampoFormularioBo;
import com.ars.sirproj.bo.CtgCatalogoBo;
import com.ars.sirproj.dto.Campoformulario;
import com.ars.sirproj.dto.CtgCatalogo;
import com.ars.sirproj.dto.Formularioproceso;
import com.ars.sirproj.util.UtilConstant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlMessage;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.convert.NumberConverter;
import org.primefaces.component.outputpanel.OutputPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.SaltSource;
import com.ars.sirproj.clases.Mensaje;

/**
 *
 * @author Sonia Garcia
 */
public class CampoFormularioBean implements Serializable {

    private transient UIComponent component1, component2;
    //DI via Spring
    private CampoFormularioBo campoFormularioBo;
    private CtgCatalogoBo ctgCatalogoBo;
    private Campoformulario campoFormularioObj;
    private CtgCatalogo ctgCatalogoObj;
    private Formularioproceso formularioprocesoObj;
    private List<Campoformulario> camposformulario;
    private List<CtgCatalogo> comboBoxRoles;
    public CtgCatalogo ctgCatalogo;

    private Mensaje mensaje;

    @Autowired
    private SaltSource saltSource;

    /**
     * Constructor de la clase UsuarioBean
     */
    public CampoFormularioBean() {
        campoFormularioObj = new Campoformulario();
        ctgCatalogoObj = new CtgCatalogo();
        formularioprocesoObj = new Formularioproceso();
        camposformulario = new ArrayList<Campoformulario>();
        comboBoxRoles = new ArrayList<CtgCatalogo>();
        ctgCatalogo = new CtgCatalogo();
        mensaje = new Mensaje();
    }

    public void fillTable() {
        formularioprocesoObj.setIdFormulario(1);
        setCamposformulario(getCampoFormularioBo().findAllCampos(formularioprocesoObj));
    }

    public void fillComboBoxRol() {
        setComboBoxRoles(getCtgCatalogoBo().findByCatalogoPadre(UtilConstant.CatalogoTiposCampos));
    }

    public Long getSaveUsuario() {
        return getCampoFormularioBo().saveCampo(getCampoFormularioObj());
    }

    public Long getUpdateUsuario() {
        getCampoFormularioBo().updateCampo(getCampoFormularioObj());
        return 1L;
    }

    public void DeleteCampo() {
        getCampoFormularioBo().deleteCampo(getCampoFormularioObj());
        resetFail();
    }

    public void AccionCampoFormulario() {
        try {
            campoFormularioObj.setCtgCatalogo(ctgCatalogoObj);
            campoFormularioObj.setFormularioproceso(getFormularioprocesoObj());
            getCampoFormularioBo().saveCampo(campoFormularioObj);
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
        campoFormularioObj.setCtgCatalogo(comboBoxRoles.get(0));
    }

    public void resetFail() {
        this.campoFormularioObj.setIdCampo(0L);
        this.campoFormularioObj.setCtgCatalogo(null);
        this.campoFormularioObj.setFormularioproceso(null);
        this.campoFormularioObj.setValorcampo(null);
        this.campoFormularioObj.setLargocampo(null);
        this.campoFormularioObj.setEstado(null);
        this.campoFormularioObj.setEtiqueta(null);
        fillTable();
        fillComboBoxRol();

    }

    public List<CtgCatalogo> getCatalogoList() {
        return getComboBoxRoles();
    }

    public List<Campoformulario> getCampoList() {
        return camposformulario;
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

    public void updateComponent() {
        NumberConverter number = new NumberConverter();
        component1.getChildren().clear();
        component2.getChildren().clear();

        final FacesContext fc = FacesContext.getCurrentInstance();
        final Application app = fc.getApplication();

        formularioprocesoObj.setIdFormulario(1);
        List<Campoformulario> listaCampos = getCampoFormularioBo().findAllCampos(formularioprocesoObj);
        OutputPanel panel = (OutputPanel) app.createComponent(OutputPanel.COMPONENT_TYPE);
        OutputPanel panel1 = (OutputPanel) app.createComponent(OutputPanel.COMPONENT_TYPE);
        panel.setLayout("block");
        panel1.setLayout("block");
        panel.setStyle(getRandomStyle());
        panel1.setStyle(getRandomStyle());
        panel.setId("panelLabels");
        panel1.setId("panelCampos");
        panel.setStyle("border: 0px");
        panel1.setStyle("border: 0px");
        int i = 1;
        for (Campoformulario campo : listaCampos) {
            HtmlOutputText text = (HtmlOutputText) app.createComponent(HtmlOutputText.COMPONENT_TYPE);
            HtmlInputText input = (HtmlInputText) app.createComponent(HtmlInputText.COMPONENT_TYPE);
            HtmlMessage message = (HtmlMessage) app.createComponent(HtmlMessage.COMPONENT_TYPE);
            text.setValue(campo.getEtiqueta());
            text.setId("l" + i);
            text.setStyle("display:block;padding-top: 0px;padding-bottom: 10px;margin-right:50px;margin-left:5px;");
            input.setId("campo" + campo.getIdCampo().toString());
            input.setStyle("width: 400px;");
            input.setMaxlength(Integer.parseInt(campo.getLargocampo()));
            input.setSize(Integer.parseInt(campo.getLargocampo()));
            if(campo.getCtgCatalogo().getCtgCatHijo().trim().equals(UtilConstant.CatalogoHijoTipoNumerico))
            {
                input.setConverter(number);
            }
            panel.getChildren().add(text);
            panel1.getChildren().add(input);
//             linebreak construction  
            HtmlOutputText linebreak = new HtmlOutputText();
            linebreak.setValue("<br/>");
            linebreak.setEscape(false);
            panel.getChildren().add(linebreak);
            panel1.getChildren().add(linebreak);
            i++;
        }
        component1.getChildren().add(panel);
        component2.getChildren().add(panel1);

    }

    public void SaveValuesCampos() {
        try {
            List<UIComponent> listaComponentes = component2.getChildren().get(0).getChildren();
            for (UIComponent componente : listaComponentes) {
                String id = componente.getId().toString().trim();
                if (id.contains("campo")) {
                    HtmlInputText input1 = (HtmlInputText) componente;
                    String Valor = input1.getValue().toString();
                    campoFormularioObj.setIdCampo(Long.parseLong(id.substring(5)));
                    campoFormularioObj.setValorcampo(Valor);
                    getCampoFormularioBo().updateValorCampo(campoFormularioObj);
                }
            }

            updateComponent();

        } catch (Exception e) {
            mensaje.messageError(mensaje.getIerror());
            e.printStackTrace();
        }
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
     * @return the campoFormularioBo
     */
    public CampoFormularioBo getCampoFormularioBo() {
        return campoFormularioBo;
    }

    /**
     * @param campoFormularioBo the campoFormularioBo to set
     */
    public void setCampoFormularioBo(CampoFormularioBo campoFormularioBo) {
        this.campoFormularioBo = campoFormularioBo;
    }

    /**
     * @return the campoFormularioObj
     */
    public Campoformulario getCampoFormularioObj() {
        return campoFormularioObj;
    }

    /**
     * @param campoFormularioObj the campoFormularioObj to set
     */
    public void setCampoFormularioObj(Campoformulario campoFormularioObj) {
        this.campoFormularioObj = campoFormularioObj;
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
     * @return the camposformulario
     */
    public List<Campoformulario> getCamposformulario() {
        return camposformulario;
    }

    /**
     * @param camposformulario the camposformulario to set
     */
    public void setCamposformulario(List<Campoformulario> camposformulario) {
        this.camposformulario = camposformulario;
    }

    /**
     * @return the formularioprocesoObj
     */
    public Formularioproceso getFormularioprocesoObj() {
        return formularioprocesoObj;
    }

    /**
     * @param formularioprocesoObj the formularioprocesoObj to set
     */
    public void setFormularioprocesoObj(Formularioproceso formularioprocesoObj) {
        this.formularioprocesoObj = formularioprocesoObj;
    }

    /**
     * @return the component
     */
    public UIComponent getComponent1() {
        return component1;
    }

    /**
     * @param component1 the component to set
     */
    public void setComponent1(UIComponent component1) {
        this.component1 = component1;
    }

    private static final String[] STYLES = {
        "border: dotted 1px orange;",
        "border: dotted 1px green;",
        "border: dotted 1px blue;",
        "border: dotted 1px red;",
        "border: dashed 1px orange;",
        "border: dashed 1px green;",
        "border: dashed 1px blue;",
        "border: dashed 1px red;"
    };

    private String getRandomStyle() {
        String style = "padding: .5em;";

        style += STYLES[1];

        return style;
    }

    /**
     * @return the component2
     */
    public UIComponent getComponent2() {
        return component2;
    }

    /**
     * @param component2 the component2 to set
     */
    public void setComponent2(UIComponent component2) {
        this.component2 = component2;
    }
}
