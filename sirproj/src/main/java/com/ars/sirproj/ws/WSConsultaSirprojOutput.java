package com.ars.sirproj.ws;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ars.sirproj.ws.dto.WSConsultaSirprojDatosGeneralesOutput;

@XmlRootElement(name = "Estudio_Completo_Persona_Sirproj")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class WSConsultaSirprojOutput {
	private String codigoRetorno;
	private String mensajeRetorno;
	private String fechaConsulta;
	private String numeroSolicitud;
	private WSConsultaSirprojDatosGeneralesOutput Datos_Generales;
	
	
	public String getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getMensajeRetorno() {
		return mensajeRetorno;
	}

	public void setMensajeRetorno(String mensajeRetorno) {
		this.mensajeRetorno = mensajeRetorno;
	}

	public String getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public String getNumeroSolicitud() {
		return numeroSolicitud;
	}

	public void setNumeroSolicitud(String numeroSolicitud) {
		this.numeroSolicitud = numeroSolicitud;
	}

	public WSConsultaSirprojDatosGeneralesOutput getDatos_Generales() {
		return Datos_Generales;
	}

	public void setDatos_Generales(
			WSConsultaSirprojDatosGeneralesOutput datos_Generales) {
		Datos_Generales = datos_Generales;
	}
	
}
