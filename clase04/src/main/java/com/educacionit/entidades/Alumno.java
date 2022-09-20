package com.educacionit.entidades;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona {
	private String[] cursos;

	public Alumno() {
		super();
	}

	public Alumno(Documento documento, String nombre, String apellido, Date fechaNacimiento, boolean activo,
			String[] cursos) {
		super(documento, nombre, apellido, fechaNacimiento, activo);
		this.cursos = cursos;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	@Override // 
	public void quienSoy() {
		
		System.out.println("y soy un alumno");	
	}

	@Override
	public String toString() {
		return "Alumno [getDocumento()=" + getDocumento() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + ", getFechaNacimiento()=" + getFechaNacimiento() + ", isActivo()=" + isActivo()
				+ ", cursos=" + Arrays.toString(cursos) + "]";
	}
	
	

}
