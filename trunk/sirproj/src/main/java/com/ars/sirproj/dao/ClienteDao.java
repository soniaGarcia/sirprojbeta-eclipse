/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ars.sirproj.dao;

import com.ars.sirproj.dto.Cliente;
import java.util.List;

/**
 *
 * @author Sonia Garcia
 */
public interface ClienteDao {

    public void deleteCliente(Cliente cliente);

    public List<Cliente> findAllCliente();

    public void saveCliente(Cliente cliente);

    public void updateCliente(Cliente cliente);

}
