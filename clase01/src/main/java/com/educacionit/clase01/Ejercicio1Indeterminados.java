package com.educacionit.clase01;

public class Ejercicio1Indeterminados {
	public static void main(String[] args) {
		// aut -contad LONG BIGINT
		//
		float precio = 50.0f;
		float inflacion = 5.0f;// 1.005
		// varchar 99669633369

		short meses = 0;
		// es una buena linea
		inflacion = ((inflacion / 12) / 100);

		while (precio <= 100) {
			precio += (precio * inflacion);
			meses++;
		}
		/*
		 * do { precio += (precio * inflacion); meses++; } while (precio <= 100);
		 * 
		 */

		System.out.println(meses);

		// enteros son tratados con int
		// si son decimales son trataod como doubles
	}
}
