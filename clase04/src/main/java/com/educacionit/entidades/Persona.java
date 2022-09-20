package com.educacionit.entidades;

import java.util.Date;

// proveedores tipo y numero documento  CUIT RIF 2305606
public class Persona {// extends Object

	private Documento documento;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private boolean activo;

	public Persona() {
		super();
	}

	public Persona(Documento documento, String nombre, String apellido, Date fechaNacimiento, boolean activo) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.activo = activo;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public final void quienSoy() {
		System.out.println("soy una persona");
	}

	@Override
	public String toString() {
		return "Persona [documento=" + documento+ ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", activo=" + activo + "]";
	}
	


}
