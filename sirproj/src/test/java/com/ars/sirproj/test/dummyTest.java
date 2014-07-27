package com.ars.sirproj.test;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import com.ars.sirproj.util.SirprojUtil;
import com.ars.sirproj.ws.WSConsultaSirprojService;
import com.ars.sirproj.ws.dto.WSConsultaSirprojOutput;

public class dummyTest {

	@Test
	public void consumirWS() {
		
		String endPoint = "http://localhost:8080/sirproj/services/WSConsultaSirproj";
		String timeOut ="300000";
		String usuario= "prueba";
		String clave = "prueba";
		String numeroDocumento ="09989333";
		String xml = StringUtils.EMPTY;
		
		WSConsultaSirprojOutput respuesta = new WSConsultaSirprojOutput();
		
		try {
			
			WSConsultaSirprojService consultaSirproj = (WSConsultaSirprojService) SirprojUtil.getWebServiceProxy(WSConsultaSirprojService.class, endPoint, timeOut);
			xml = consultaSirproj.consultarCliente(usuario, clave, numeroDocumento);
			if(StringUtils.isNotBlank(xml))
				respuesta = (WSConsultaSirprojOutput) SirprojUtil.parseXmlResponse(xml, WSConsultaSirprojOutput.class);
		 if(respuesta != null)
		 {
			 System.out.println("Codigo Error: "+respuesta.getCodigoRetorno());
			 System.out.println("Mensaje de Error: "+respuesta.getMensajeRetorno());
			 
		 }
		
		}
		catch (Exception e) {
			
		}
	}

	
}
