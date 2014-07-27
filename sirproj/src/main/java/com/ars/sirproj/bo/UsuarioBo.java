/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ars.sirproj.bo;

import com.ars.sirproj.dto.CtgCatalogo;
import com.ars.sirproj.dto.Usuario;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface UsuarioBo {
    List<Usuario> findAllUsers();
    Long saveUsuario(Usuario usuario);
    void updateUsuario(Usuario usuario);
    void deleteUsuario(Usuario usuario);
    public List<Usuario> findByUsuario(Usuario usuario);
}
