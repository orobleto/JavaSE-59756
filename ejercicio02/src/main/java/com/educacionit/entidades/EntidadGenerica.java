package com.educacionit.entidades;

import java.util.Date;

import com.educacionit.utilidades.DateUtilidades;

// lombok 
public class EntidadGenerica {
	protected int id;
	protected boolean activo;
	protected Date fechaCreacion;

	public EntidadGenerica() {
		super();
	}

	public EntidadGenerica(int id, boolean activo, Date fechaCreacion) {
		super();
		this.id = id;
		this.activo = activo;
		this.fechaCreacion = fechaCreacion;
	}


	public String toString() {
		return "EntidadGenerica [id=" + id + ", activo=" + activo + ", fechaCreacion=" +  DateUtilidades.getFechaCadena(fechaCreacion) + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
