package com.educacionit.utilidades;

public class StringUtilidades {

	// es para que nadie lo instancie
	private StringUtilidades() {

	}

	// NULL O ""

	public static boolean estaVacio(String cadena) {
		return cadena == null || cadena.length() == 0;
	}

// octavio --> Octavio
	public static String capitalizar(String cadena) {
		if (estaVacio(cadena)) {
			return cadena;
		}
		return cadena.substring(0, 1).toUpperCase() + "" + cadena.substring(1).toLowerCase();

	}

}
