package com.educacionit.clase01;

public class OperadorTernario {
	public static void main(String[] args) {
		String mensaje = "";
		byte edad = 20;

		mensaje = edad >= 18 ? "Usted cumple los requisitos para votar" : "Usted no cumple los requisitos para votar";

		System.out.println(mensaje);

		System.out.println(
				edad >= 18 ? "Usted cumple los requisitos para votar" : "Usted no cumple los requisitos para votar");

		boolean mayorEdad = edad >= 18;

		System.out.println(
				mayorEdad ? "Usted cumple los requisitos para votar" : "Usted no cumple los requisitos para votar");
	}
	/*
	 * Modo convencional String mensaje = ""; byte edad = 17;
	 * 
	 * if (edad >= 18) { mensaje = "Usted cumple los requisitos para votar"; }else {
	 * mensaje ="Usted no cumple los requisitos para votar"; }
	 * 
	 * System.out.println(mensaje);
	 * 
	 */

}
