package com.educacionit.clase01;

import java.util.Scanner;

public class ejercicio1Arreglo {
	public static void main(String[] args) {
		// promedio de notas

		float[] notas; // ?
		Scanner teclado = new Scanner(System.in);
		System.out.print("Indica la cantidad de notas: ");
		notas = new float[teclado.nextInt()];
		float promedio = 0;

		/*
		 * int cantNotas = teclado.nextInt();
		 * 
		 * notas = new float[cantNotas];
		 */

		// un ciclo para capturar datos
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduce la nota[" + (i + 1) + "]: ");
			notas[i] = teclado.nextFloat();
		}

		// mostrar promedio
		// un ciclo para calcular

		for (int i = 0; i < notas.length; i++) {
			promedio += notas[i];
		}
		
		// nota mayor y nota menor
		
		
		float notaMayor = notas[0];
		float notaMenor = notas[0];
		for (int i = 0; i < notas.length; i++) {
			if (notaMayor <notas[i] ) {
				notaMayor = notas[i];
			}
			
			if (notaMenor> notas[i]) {
				notaMenor = notas[i];
			}
			
			
		}

		promedio /= notas.length;
		System.out.println("El promedio de notas es: " + promedio);
		System.out.println("Nota Mayor es " + notaMayor);
		System.out.println("Nota Menor es " + notaMenor);
		teclado.close();

	}
}
