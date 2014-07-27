/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ars.sirproj.dao;

import com.ars.sirproj.dto.CtgCatalogo;
import com.ars.sirproj.dto.Usuario;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface UsuarioDao {
      public List<Usuario> findAllUsers();
      public Long saveUsuario(Usuario usuario);
      public void updateUsuario(Usuario usuario);
      public void deleteUsuario(Usuario usuario);
      public List<Usuario> findByUsuario(Usuario usuario);
       
}

