package com.ars.sirproj.ws;

import java.io.StringWriter;

import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.security.authentication.BadCredentialsException;
import com.ars.sirproj.ws.dto.WSConsultaSirprojDatosGeneralesOutput;

@WebService(serviceName = "WSConsultaSirproj", endpointInterface = "com.ars.sirproj.ws.WSConsultaSirprojService")
public class WSConsultaSirproj implements WSConsultaSirprojService {
	private static final Logger logger = Logger.getLogger(WSConsultaSirproj.class);
	private static final String SUCCESS_TRX = "TRANSACCION EXITOSA";
	private static final String FAILURE_TRX = "TRANSACCION FALLIDA";

	@SuppressWarnings({ "rawtypes", "unused" })
	public String consultarCliente(String usuario, String clave, String numeroDocumento) {
		String codigoRetorno = "00";
		String mensajeRetorno = SUCCESS_TRX;

		WSConsultaSirprojOutput output = new WSConsultaSirprojOutput();
		if (!StringUtils.isBlank(usuario) && !StringUtils.isBlank(clave)  && !StringUtils.isBlank(numeroDocumento)) {
			if (usuario.length() > 20) {
				codigoRetorno = "05";
				mensajeRetorno = "USUARIO NO ES CORRECTO";
				logger.error("Error: " + mensajeRetorno);
			} else if (clave.length() > 8) {
				codigoRetorno = "06";
				mensajeRetorno = "CLAVE NO ES CORRECTA";
				logger.error("Error: " + mensajeRetorno);
			}

			if ("00".equals(codigoRetorno)) {
				try {
										
				output.setDatos_Generales(getDatosGenerales());
				output.setCodigoRetorno(codigoRetorno);
				output.setMensajeRetorno(mensajeRetorno);
				}
				catch(BadCredentialsException ei)
				{
					codigoRetorno = "03";
					mensajeRetorno = "USUARIO Y CLAVE INVALIDOS EN EL SISTEMA";
					logger.info(mensajeRetorno);


				} catch (Exception e)
				{
					codigoRetorno = "14";
					mensajeRetorno = FAILURE_TRX;
					logger.error(FAILURE_TRX + ". ERROR EJECUTANDO BUSQUEDA DE CANDIDATO", e);
				}
			}else{
				
				output.setCodigoRetorno(codigoRetorno);
				output.setMensajeRetorno(mensajeRetorno);
			}
		} else {
			if (StringUtils.isBlank(usuario)) {
				codigoRetorno = "01";
				mensajeRetorno = "USUARIO NO DEBE SER VACIO O NULO";
				logger.info(mensajeRetorno);
			} else if (StringUtils.isBlank(clave)) {
				codigoRetorno = "02";
				mensajeRetorno = "CLAVE NO DEBE SER VACIA O NULA";
				logger.info(mensajeRetorno);
			} else if (StringUtils.isBlank(numeroDocumento)) {
				codigoRetorno = "04";
				mensajeRetorno = "NUMERO DE DOCUMENTO NO DEBE SER VACIO O NULO";
				logger.info(mensajeRetorno);
			}
		}
		return marshal(output,1);

	}



	private String marshal(Object output, int option) {
		String response = StringUtils.EMPTY;
		StringWriter writer = new StringWriter();
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(WSConsultaSirprojOutput.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(output, writer);
			response = writer.toString();
		} catch (JAXBException e) {
			logger.error("Error convirtiendo objeto a XML: " + e.getMessage(), e);
		}
		return response;
	}
	

	private WSConsultaSirprojDatosGeneralesOutput getDatosGenerales(){
		WSConsultaSirprojDatosGeneralesOutput datosGenerales = new WSConsultaSirprojDatosGeneralesOutput();
		try {
			
				datosGenerales.setCedula("0947739893");
					datosGenerales.setNombre("Rigoberta");
					datosGenerales.setApellido1("Menchu");
					datosGenerales.setApellido2("Rivera");
					datosGenerales.setFecha_Nacimiento("20/01/1960");
					datosGenerales.setEdad("100");
					datosGenerales.setGenero("F");
					datosGenerales.setEstado_Civil("Viuda");
					datosGenerales.setNacionalidad("Desconocida");
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Exception:", e);
		}
		return datosGenerales;


	}
}
