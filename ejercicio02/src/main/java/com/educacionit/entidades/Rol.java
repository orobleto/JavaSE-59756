package com.educacionit.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.educacionit.utilidades.DateUtilidades;

public final class Rol extends EntidadGenerica {
	private String descripcion;

	public Rol() {
		super();
	}

	public Rol(int id, boolean activo, Date fechaCreacion, String descripcion) {
		super(id, activo, fechaCreacion);
		this.descripcion = descripcion;
	}

	public String toString() {
		return "Rol [id=" + id + ", activo=" + activo + ", fechaCreacion=" + DateUtilidades.getFechaCadena(fechaCreacion) + ", descripcion="
				+ descripcion + "]";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
