package com.educacionit.entidades;

import java.util.Date;

public class Empleado extends Persona{
	private float sueldo;


	public Empleado() {
		super();
	}

	public Empleado(Documento documento, String nombre, String apellido, Date fechaNacimiento, boolean activo,
			float sueldo) {
		super(documento, nombre, apellido, fechaNacimiento, activo);
		this.sueldo = sueldo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
}
