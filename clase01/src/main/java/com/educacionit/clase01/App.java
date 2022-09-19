package com.educacionit.clase01;

import java.util.Scanner;

/**
 * @author educacion it esta clase es la primera clase que nosotros vemos
 */
public class App {

	public static void main(String[] args) throws InterruptedException {
		int numero1 = 5;
		int numero2 = 6;
		char operador = '/';
		Thread.sleep(1000);
		if (operador == '+' || operador == 's') {
			System.out.println(numero1 + numero2);
		} else if (operador == '-' || operador == 'r') {

		} else if (operador == '*') {

		} else if (operador == '/') {

		}

		switch (operador) {
			case '+':
			case 's':
				System.out.println(numero1 + numero2);
				break;
			case 'r':
			case '-':
				System.out.println(numero1 + numero2);
				break;
			default:
				break;
		}
		System.out.println("fin");

	}

}
