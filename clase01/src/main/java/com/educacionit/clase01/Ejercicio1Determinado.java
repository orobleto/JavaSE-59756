package com.educacionit.clase01;

public class Ejercicio1Determinado {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
			// continue;
			// break;
		}
		
		
		for (int i = 0; i < 20; i++) {

			
			if (i==5) {
				continue;
			}
			if (i == 16) {
				break;
			}
			
			System.out.println(i);
		
			
		}
	}
}
