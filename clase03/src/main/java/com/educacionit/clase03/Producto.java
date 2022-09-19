package com.educacionit.clase03;

import javax.swing.JOptionPane;

class Producto { // default
	long codigo;// default
	String descripcion;
	float precio;
	int cantidad;
	boolean activo;

	void mostrarInformacion() { // default
		JOptionPane.showMessageDialog(null,
				"Codigo: " + codigo + ";" + " Descripcion: " + descripcion + ";" + "	Precio: "
						+ String.format("%.2f", precio) + "; " + " Cantidad: " + cantidad + "; "
						+ (activo ? "Activo" : "Inactivo"));
	}

	void activar(boolean activo) {
		this.activo = activo;
	}

	// guardar
	// eliminar
	// imprimir

}
