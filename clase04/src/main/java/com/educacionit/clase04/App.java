package com.educacionit.clase04;

import java.util.Date;

import javax.swing.JOptionPane;

import com.educacionit.entidades.Alumno;
import com.educacionit.entidades.Documento;
import com.educacionit.entidades.Persona;
import com.educacionit.entidades.Profesor;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Persona persona01 = new Persona();
		Profesor profesor = new Profesor(new Documento("DNI", 1), "Octavio", "Robleto", new Date(), false, 50.6f);
		
		System.out.println(profesor);//Object

	}
}
