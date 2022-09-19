package com.educacionit.entidades;

import com.educacionit.utilidades.StringUtilidades;

public class Alumno {
	private long id; // autogenerado asc 1 2 3 4 5 6
	private String tipoDocumento;
	private int numeroDocumento;
	private String nombre;
	private String apellido;
	private boolean activo;
	private String[] cursos;
	private static long contadorId = 0;
	public static final String INSTITUTO = "Educacion IT";

	public Alumno() {
		super();
		contadorId++;
		this.id = contadorId;
	}

	public Alumno(String tipoDocumento, int numeroDocumento, String nombre, String apellido, boolean activo,
			String[] cursos) {
		super();
		contadorId++;
		this.id = contadorId;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.activo = activo;
		this.cursos = cursos;
	}

	public Alumno(long id, String tipoDocumento, int numeroDocumento, String nombre, String apellido, boolean activo,
			String[] cursos) {
		super();
		this.id = id;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.activo = activo;
		this.cursos = cursos;
	}

	public String getAtributos() {
		return "ID = " + id + " de " + contadorId + "; Tipo Documento = " + tipoDocumento + "; Numero Documento = "
				+ numeroDocumento + "; Nombre y Apellido = " + StringUtilidades.capitalizar(nombre) + " "
				+ StringUtilidades.capitalizar(apellido) + "; ";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		if (StringUtilidades.estaVacio(tipoDocumento)) {
			System.out.println("Debe enviar un tipo de Documento");
			// muestrale al desarrollador un posible error
		}
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

}
