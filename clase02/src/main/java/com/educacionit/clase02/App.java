package com.educacionit.clase02;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String string;
		Scanner teclado = new Scanner(System.in);
		// declarar el dato objeto
		Alumno juan;
		juan = new Alumno();
		juan.numeroDocumento = 95000000;
		juan.nombre="juan";
		juan.apellido="correa";
		juan.anioNacimiento =(byte) 1986;
		juan.calcularEdad((byte) 220);
		
		Alumno dario;
		dario = new Alumno();
		dario.numeroDocumento = 15000000;
		
		
		System.out.println(juan.edad);
		System.out.println(juan.calcularEdad());
		System.out.println(juan.activo);
		
		System.out.println(dario.edad);
		
		
		Alumno lucia = new Alumno(16589362);
		System.out.println(lucia.numeroDocumento);

	}
}
