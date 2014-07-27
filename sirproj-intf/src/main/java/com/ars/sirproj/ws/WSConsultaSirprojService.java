
package com.ars.sirproj.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSConsultaSirprojService", targetNamespace = "http://ws.sirproj.ars.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSConsultaSirprojService {


    /**
     * 
     * @param usuario
     * @param numeroDocumento
     * @param clave
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarCliente", targetNamespace = "http://ws.sirproj.ars.com/", className = "com.ars.sirproj.ws.ConsultarCliente")
    @ResponseWrapper(localName = "consultarClienteResponse", targetNamespace = "http://ws.sirproj.ars.com/", className = "com.ars.sirproj.ws.ConsultarClienteResponse")
    public String consultarCliente(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "clave", targetNamespace = "")
        String clave,
        @WebParam(name = "numeroDocumento", targetNamespace = "")
        String numeroDocumento);

}