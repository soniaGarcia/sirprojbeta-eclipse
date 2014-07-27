/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.clases;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Sonia Garcia
 */
@ManagedBean
@ViewScoped
public class Person implements Serializable {

    private int codigo_u;
    private int codigo_s;
    private int codigo_em;
    private String nombre_em;
    private String apellido_em;
    private String user;
    private String nivel;
    

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getApellido_em() {
        return apellido_em;
    }

    public void setApellido_em(String apellido_em) {
        this.apellido_em = apellido_em;
    }

    public int getCodigo_em() {
        return codigo_em;
    }

    public void setCodigo_em(int codigo_em) {
        this.codigo_em = codigo_em;
    }

    public int getCodigo_s() {
        return codigo_s;
    }

    public void setCodigo_s(int codigo_s) {
        this.codigo_s = codigo_s;
    }

    public int getCodigo_u() {
        return codigo_u;
    }

    public void setCodigo_u(int codigo_u) {
        this.codigo_u = codigo_u;
    }

    public String getNombre_em() {
        return nombre_em;
    }

    public void setNombre_em(String nombre_em) {
        this.nombre_em = nombre_em;
    }

}
