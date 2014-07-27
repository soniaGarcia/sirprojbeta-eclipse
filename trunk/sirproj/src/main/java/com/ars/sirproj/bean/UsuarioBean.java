/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bean;

import com.ars.sirproj.bo.CtgCatalogoBo;
import com.ars.sirproj.bo.UsuarioBo;
import com.ars.sirproj.dto.CtgCatalogo;
import com.ars.sirproj.dto.Usuario;
import com.ars.sirproj.util.UtilConstant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.ars.sirproj.clases.Mensaje;

/**
 *
 * @author Sonia Garcia
 */
public class UsuarioBean implements Serializable {

    //DI via Spring
    private UsuarioBo usuarioBo;
    private CtgCatalogoBo ctgCatalogoBo;
    private Usuario usuarioObj;
    private CtgCatalogo ctgCatalogoObj;
    private List<Usuario> usuarios;
    private List<CtgCatalogo> comboBoxRoles;
    public CtgCatalogo ctgCatalogo;

    private Mensaje mensaje;

    @Autowired
    private SaltSource saltSource;

    /**
     * Constructor de la clase UsuarioBean
     */
    public UsuarioBean() {
        usuarioObj = new Usuario();
        ctgCatalogoObj = new CtgCatalogo();
        usuarios = new ArrayList<Usuario>();
        comboBoxRoles = new ArrayList<CtgCatalogo>();
        ctgCatalogo = new CtgCatalogo();
        mensaje = new Mensaje();
    }

    public void fillTable() {
        usuarios = getUsuarioBo().findAllUsers();
    }

    public void fillComboBoxRol() {
        setComboBoxRoles(getCtgCatalogoBo().findByCatalogoPadre(UtilConstant.CatalogoNivelesUsuario));
    }

    public Long getSaveUsuario() {
        usuarioObj.setCambiarClave("1");
        usuarioObj.setEstado(true);
        return getUsuarioBo().saveUsuario(getUsuarioObj());
    }

    public Long getUpdateUsuario() {
        getUsuarioBo().updateUsuario(getUsuarioObj());
        return 1L;
    }

    public void DeleteUsuario() {
        getUsuarioBo().deleteUsuario(getUsuarioObj());
        mensaje.messageInfo(mensaje.getIeliminada());
        resetFail();
    }

    public void AccionUsuario() {
        try {
            String passwordNormal = usuarioObj.getPassword();
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String passwordEncriptado = passwordEncoder.encode(passwordNormal);
            usuarioObj.setPassword(passwordEncriptado);
            usuarioObj.setCtgCatalogo(ctgCatalogoObj);
            getUsuarioBo().saveUsuario(usuarioObj);
            mensaje.messageInfo(mensaje.getIinformation());
            fillTable();
            fillComboBoxRol();
        } catch (Exception e) {
            mensaje.messageError(mensaje.getIerror());
            e.printStackTrace();
        }
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public CtgCatalogo getCtgCatalogo() {
        return ctgCatalogo;
    }

    public void setCtgCatalogo(CtgCatalogo ctgCatalogo) {
        this.ctgCatalogo = ctgCatalogo;
    }

    public void llenarCatalogo() {
        usuarioObj.setCtgCatalogo(comboBoxRoles.get(0));
    }

    public void resetFail() {
        this.usuarioObj.setIdUsuario(0L);
        this.usuarioObj.setCtgCatalogo(null);
        this.usuarioObj.setUsuario(null);
        this.usuarioObj.setPassword(null);
        this.usuarioObj.setEstado(null);
        this.usuarioObj.setNombre(null);
        this.usuarioObj.setApellido(null);
        this.usuarioObj.setCambiarClave(null);
        fillTable();
        fillComboBoxRol();

    }

    public List<CtgCatalogo> getCatalogoList() {
        return getComboBoxRoles();
    }

    public List<Usuario> getUserList() {
        return usuarios;
    }

    /**
     * @return the usuarioBo
     */
    public UsuarioBo getUsuarioBo() {
        return usuarioBo;
    }

    /**
     * @param usuarioBo the usuarioBo to set
     */
    public void setUsuarioBo(UsuarioBo usuarioBo) {
        this.usuarioBo = usuarioBo;
    }

    /**
     * @return the usuarioObj
     */
    public Usuario getUsuarioObj() {
        return usuarioObj;
    }

    /**
     * @param usuarioObj the usuarioObj to set
     */
    public void setUsuarioObj(Usuario usuarioObj) {
        this.usuarioObj = usuarioObj;
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
}
