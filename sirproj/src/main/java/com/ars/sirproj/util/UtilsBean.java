/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.util;

import com.ars.sirproj.bo.CtgCatalogoBo;
import com.ars.sirproj.dao.CtgCatalogoDao;
import com.ars.sirproj.dto.CtgCatalogo;
import static com.ars.sirproj.util.UtilConstant.CatalogoNivelesUsuario;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author Sonia Garcia
 */
public class UtilsBean implements Serializable {

    private Authentication autenticacion = SecurityContextHolder.getContext().getAuthentication();
    private CtgCatalogoBo ctgCatalogoBo;

    /**
     * Redirecciona al usuario a la pagina de login si no ha iniciado sesión
     *
     * @return
     */
    public String getSessionActiva() {
        if (getIsAutenticado() == false) {
            String url = "../../login.jsp";
            FacesContext fc = FacesContext.getCurrentInstance();
            try {
                fc.getExternalContext().redirect(url);
            } catch (IOException ex) {
                Logger.getLogger(UtilsBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "";

    }

    /**
     * Devuelve true o false dependiendo si el usuario esta logeado
     *
     * @return
     */
    public boolean getIsAutenticado() {
        boolean resultado = (getAutenticacion() != null) && !(getAutenticacion() instanceof AnonymousAuthenticationToken)
                && getAutenticacion().isAuthenticated();
        return resultado;

    }

    /**
     * Devuelve el nombre del usuario en session
     *
     * @return
     */
    public String getUserSession() {
        String Nombre = "";
        if (getIsAutenticado()) {
            Nombre = getAutenticacion().getName();
        }

        return Nombre;

    }

    /**
     * Devuelve un string conteniendo el rol del usuario logeado
     *
     * @return
     */
    public String getSessionPermission() {
        String Permission = "";
        if (getIsAutenticado()) {
            for (GrantedAuthority auth : getAutenticacion().getAuthorities()) {
                Permission += auth;
            }

        }

        return Permission;
    }
    
     /**
     * Devuelve un string conteniendo el Id del rol del usuario logeado
     *
     * @return
     */
    public String getSessionPermissionId() {
        String Permission = "";
        String IdUserPermission= "";
        CtgCatalogo ctgCatalogo = new CtgCatalogo();
        if (getIsAutenticado()) {
            for (GrantedAuthority auth : getAutenticacion().getAuthorities()) {
                Permission = auth.toString();
            }
            
           ctgCatalogo = getCtgCatalogoBo().findCatalogoHijo(CatalogoNivelesUsuario, Permission);
           IdUserPermission = ctgCatalogo.getCtgCatHijo();

        }

        return IdUserPermission;
    }

    /**
     * Devuelve un boolean indicando si el rol dado como parametro
     * esta asignado al usuario en sesion
     *
     * @param role role a consultar
     * @return
     */
    public boolean getIsRolUserSession(String role) {
        if (getIsAutenticado()) {
            for (GrantedAuthority auth : getAutenticacion().getAuthorities()) {
                if (role.equals(auth.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @return the autenticacion
     */
    public Authentication getAutenticacion() {
        return autenticacion;
    }

    /**
     * @param autenticacion the autenticacion to set
     */
    public void setAutenticacion(Authentication autenticacion) {
        this.autenticacion = autenticacion;
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


  

}
