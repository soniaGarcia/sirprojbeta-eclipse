package com.ars.sirproj.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface WSConsultaSirprojService {

	@WebMethod
	public String consultarCliente(@WebParam(name = "usuario") String usuario, @WebParam(name = "clave") String clave, @WebParam(name = "numeroDocumento") String numeroDocumento);
}
