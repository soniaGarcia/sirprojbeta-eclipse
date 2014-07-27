/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.clases;

import java.io.Serializable;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 *
 * @author Sonia Garcia
 */
@ManagedBean(name = "limpiarManaged")
@ViewScoped
public class LimpiarManaged implements Serializable {

    public void limpiarTodo() {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            String viewId = context.getViewRoot().getViewId();
            ViewHandler handler = context.getApplication().getViewHandler();
            UIViewRoot root = handler.createView(context, viewId);
            root.setViewId(viewId);
            context.setViewRoot(root);
        } catch (Exception ex) {
            Mensaje m = new Mensaje();
            m.message("Se ha producido un Error. Si persiste contactar al encargado de sistemas");
        }
    }

    public static void limpiar() {

        try {
            FacesContext context = FacesContext.getCurrentInstance();
            String viewId = context.getViewRoot().getViewId();
            ViewHandler handler = context.getApplication().getViewHandler();
            UIViewRoot root = handler.createView(context, viewId);
            root.setViewId(viewId);
            context.setViewRoot(root);
        } catch (Exception ex) {
            Mensaje m = new Mensaje();
            m.message(m.getIerror());
        }
    }
}
