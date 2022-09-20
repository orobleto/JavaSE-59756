package com.educacionit.entidades;

import java.util.Date;

// herencia simple 
public class Profesor extends Empleado{

	public Profesor() {
		super();

	}

	public Profesor(Documento documento, String nombre, String apellido, Date fechaNacimiento, boolean activo,
			float sueldo) {
		super(documento, nombre, apellido, fechaNacimiento, activo, sueldo);

	}

	@Override
	public String toString() {
		return "Profesor [toString()=" + super.toString() + "]";
	}
	

}
