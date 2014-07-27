package com.ars.sirproj.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Datos_Generales")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class WSConsultaSirprojDatosGeneralesOutput {
	private String Cedula;
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private String Fecha_Nacimiento;
	private String Nacionalidad;
	private String Edad;
	private String Genero;
	private String Estado_Civil;


	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getEdad() {
		return Edad;
	}

	public void setEdad(String edad) {
		Edad = edad;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getEstado_Civil() {
		return Estado_Civil;
	}

	public void setEstado_Civil(String estado_Civil) {
		Estado_Civil = estado_Civil;
	}


}
