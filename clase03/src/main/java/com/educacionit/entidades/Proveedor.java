package com.educacionit.entidades;

// Encapsuladas
public class Proveedor {
	private long codigo;
	public int numeroDocumento;
	private String razonSocial;
	private boolean activo;
	public static final String TIPO_DOCUMENTO = "DOCUMENTO COMERCIAL";

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		if (codigo < 0) {
			System.out.println("No puede ser un numero negativo");
		}
		this.codigo = codigo;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
