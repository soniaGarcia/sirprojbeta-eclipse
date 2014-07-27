/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.clases;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Sonia Garcia
 */
public class Mensaje implements Serializable {

    /********************************************************************/
    /*MENSAJES*/
    private String Iinformation = "INFORMACION ALMACENADA SATISFACTORIMANTE";
    private String Imodificada = "INFORMACION MODIFICADA SATISFACTORIMANTE";
    private String Ieliminada = "INFORMACION ELIMINADA SATISFACTORIAMENTE";
    private String Ianulada = "INFORMACION ANULADA SATISFACTORIAMENTE";
    private String Ierror = "ERROR AL REALIZAR LA OPERACION DESEADA. SI EL ERROR PERSISTE CONTACTAR AL ENCARGADO DE SISTEMA";
    /********************************************************************/
    /********************************************************************/
    /*VALIDACION*/
    private String Iemail = "El EMAIL NO ES VALIDO";
    private String Itelefono = "EL TELEFONO NO ES VALIDO";
    private String Inrc = "EL NRC NO ES VALIDO";
    private String Inumerico = "EL CAMPO DEBE SER NUMERICO";
    private String IsessionInvalida = "LA SESSION HA EXPIRADO";
    private String Icantidad = "LA CANTIDAD SOBREPASA LA CANTIDAD EN LA BASE DE DATOS";
    /********************************************************************/
    /**********************************/
    /*MENSAJES DE ROLES*/
    private String Iroles = "NO TIENE SUFICIENTES PRIVILEGIO PARA HACER LA OPERACION DESEADA. CONTACTE AL ENCARGADO DEL SISTEMA";
    private String IrolAgregar = "NO TIENE AUTORIZACION PARA AGREGAR LA OPERACION DESEADA. CONTACTE AL ENCARGADO DEL SISTEMA";
    private String IrolBuscar = "NO TIENE AUTORIZACION PARA BUSCAR LA OPERACION DESEADA. CONTACTE AL ENCARGADO DEL SISTEMA";
    private String IrolModificar = "NO TIENE AUTORIZACION PARA MODIFICAR LA OPERACION DESEADA. CONTACTE AL ENCARGADO DEL SISTEMA";
    private String IrolEliminar = "NO TIENE AUTORIZACION PARA ELIMINAR LA OPERACION DESEADA. CONTACTE AL ENCARGADO DEL SISTEMA";
    private String IrolAnular = "NO TIENE AUTORIZACION PARA ANULAR LA OPERACION DESEADA. CONTACTE AL ENCARGADO DEL SISTEMA";
    private String IrolVisible = "NO TIENE AUTORIZACION PARA VER LA PAGINA DESEADA. CONTACTE AL ENCARGADO DEL SISTEMA";

    /**********************************/
    public String getIanulada() {
        return Ianulada;
    }

    public void setIanulada(String Ianulada) {
        this.Ianulada = Ianulada;
    }

    public String getIrolAnular() {
        return IrolAnular;
    }

    public String getIcantidad() {
        return Icantidad;
    }

    public String getIrolAgregar() {
        return IrolAgregar;
    }

    public String getIrolBuscar() {
        return IrolBuscar;
    }

    public String getIrolEliminar() {
        return IrolEliminar;
    }

    public String getIrolModificar() {
        return IrolModificar;
    }

    public String getIrolVisible() {
        return IrolVisible;
    }

    public String getIroles() {
        return Iroles;
    }

    public String getIsessionInvalida() {
        return IsessionInvalida;
    }

    public String getIerror() {
        return Ierror;
    }

    public String getIeliminada() {
        return Ieliminada;
    }

    public String getIinformation() {
        return Iinformation;
    }

    public String getImodificada() {
        return Imodificada;
    }

    public String getIemail() {
        return Iemail;
    }

    public void setIemail(String Iemail) {
        this.Iemail = Iemail;
    }

    public String getInrc() {
        return Inrc;
    }

    public void setInrc(String Inrc) {
        this.Inrc = Inrc;
    }

    public String getInumerico() {
        return Inumerico;
    }

    public void setInumerico(String Inumerico) {
        this.Inumerico = Inumerico;
    }

    public String getItelefono() {
        return Itelefono;
    }

    public void setItelefono(String Itelefono) {
        this.Itelefono = Itelefono;
    }

    public void message(String mensaje) {
        FacesContext fc = FacesContext.getCurrentInstance();
        FacesMessage fm = new FacesMessage();
        fm.setSummary(mensaje);
        fc.addMessage(null, fm);
    }

    public void messageAdvertencia(String mensaje) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, mensaje, mensaje));
//        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "System Error", "Please try again later.");
//        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void messageError(String mensaje) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, mensaje));
    }

    public void messageInfo(String mensaje) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje, mensaje));
    }

    public void messageFatal(String mensaje) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, mensaje, mensaje));
    }

    public String campoError(String campo) {
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "ERROR EN EL CAMPO " + campo, "ERROR EN EL CAMPO " + campo));
       // return "ERROR EN EL CAMPO " + campo;
         return "EL CAMPO " + campo + " ES REQUERIDO";
    }
}
