package com.educacionit.entidades;

public class Factura {
	// en encapsulamiento esta permitido atributos private o protegidos
	private long numero;
	private String numeroSerieImpresora;
	private String fecha;
	public static String sucursal = "Sucursal Autralia 2"; // private

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getNumeroSerieImpresora() {
		return numeroSerieImpresora;
	}

	public void setNumeroSerieImpresora(String numeroSerieImpresora) {
		this.numeroSerieImpresora = numeroSerieImpresora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
