package com.educacionit.entidades;

public final class Documento {
	private String tipo;
	private String numero;

	public Documento() {
		super();

	}

	public Documento(String tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
