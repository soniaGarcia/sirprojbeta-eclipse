/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.dao;

import com.ars.sirproj.dto.CtgCatalogo;
import com.ars.sirproj.dto.Usuario;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sonia Garcia
 */
@Service
public class UsuarioDaoImpl extends HibernateDaoSupport implements UsuarioDao {
    
    public List<Usuario> findAllUsers() {
        return getHibernateTemplate().find("from Usuario");

    }

    
    public Long saveUsuario(Usuario usuario) {
         //Validando si sera un save o un update
        if (usuario.getIdUsuario() == 0) //Si es cero indica que se trata de un save
        //Por lo que se coloca null para 
        //Que automaticamente se coloque un Id en la BD
        {
            usuario.setIdUsuario(null);
            //Colocando valores por defecto al objeto
            usuario.setCambiarClave("1");
        }
        getHibernateTemplate().saveOrUpdate(usuario);
        return (Long) 1L;
    }

    
    public void updateUsuario(Usuario usuario) {
        getHibernateTemplate().saveOrUpdate(usuario);
    }

    
    public void deleteUsuario(Usuario usuario) {
        getHibernateTemplate().delete(usuario);
    }

    
    public List<Usuario> findByUsuario(Usuario usuario) {
        List<Usuario> user = getHibernateTemplate().find("from Usuario where usuario='" + usuario.getUsuario() + "' and password='" + usuario.getPassword() + "'");
        return user;
    }

}
