package com.educacionit.ejercicio01;

import java.util.Scanner;

import com.educacionit.entidades.Alumno;
import com.educacionit.utilidades.Constantes;
import com.educacionit.utilidades.StringUtilidades;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Alumno alumno01 = new Alumno();
		System.out.println(alumno01.getAtributos());
		Alumno alumno02 = new Alumno("DNI", 2, "maRinela", "FERRERO", true, null);
		System.out.println(alumno02.getAtributos());
		Alumno alumno03 = new Alumno("DNI", 3, "Carlos", "muñoz", true, null);
		System.out.println(alumno03.getAtributos());

		System.out.println("********************" + Alumno.INSTITUTO + "********************");

		System.out.println(alumno01.getAtributos());
		System.out.println(alumno02.getAtributos());
		System.out.println(alumno03.getAtributos());
		
		

	}
}
