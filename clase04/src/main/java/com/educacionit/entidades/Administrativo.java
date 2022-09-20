package com.educacionit.entidades;

import java.util.Date;

public class Administrativo extends Empleado{
	private String carrera;

	public Administrativo(Documento documento, String nombre, String apellido, Date fechaNacimiento, boolean activo,
			float sueldo, String carrera) {
		super(documento, nombre, apellido, fechaNacimiento, activo, sueldo);
		this.carrera = carrera;
	}

	public Administrativo() {
		super();

	}

	public Administrativo(Documento documento, String nombre, String apellido, Date fechaNacimiento, boolean activo,
			float sueldo) {
		super(documento, nombre, apellido, fechaNacimiento, activo, sueldo);
		//TODO Auto-generated constructor stub
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
}
