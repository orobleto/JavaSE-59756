package com.educacionit.clase04;

import javax.swing.JOptionPane;

public class Envoltorio {
	public static void main(String[] args) {
		// Envoltorios

		// primitivos byte short int long float double boolean char

		// objetos

		Byte miByte = 12;// new Byte(12);
		Short miShort = 25;
		Integer entero = 9;
		Long miLong = 5L;
		Float miFloat = 25.6888f;
		Double miDouble = 2.36;
		Boolean miBoolean = true;
		Character miChar = '*';

		int edad = entero;
		byte miByte2 = Byte.valueOf("1");

		edad = Integer.valueOf(JOptionPane.showInputDialog("Introduce tu edad:"));

		System.out.println(edad);
		
		int anio = 2025;
		long decada = anio; // casting 
		
		anio = (int) decada; // 9999999
	}
}
