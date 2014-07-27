/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.bo;

import com.ars.sirproj.dao.UsuarioDao;
import com.ars.sirproj.dto.CtgCatalogo;
import com.ars.sirproj.dto.Usuario;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public class UsuarioBoImpl implements UsuarioBo {

    private UsuarioDao usuarioDao;

    
    public List<Usuario> findAllUsers() {

        return usuarioDao.findAllUsers();
    }

    
    public Long saveUsuario(Usuario usuario) {
        return usuarioDao.saveUsuario(usuario);
    }

    
    public void updateUsuario(Usuario usuario) {
        usuarioDao.updateUsuario(usuario);
    }

    
    public void deleteUsuario(Usuario usuario) {
        usuarioDao.deleteUsuario(usuario);
    }

    
    public List<Usuario> findByUsuario(Usuario usuario) {
        return usuarioDao.findByUsuario(usuario);
    }

    /**
     * @return the usuarioDao
     */
    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    /**
     * @param usuarioDao the usuarioDao to set
     */
    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

}
